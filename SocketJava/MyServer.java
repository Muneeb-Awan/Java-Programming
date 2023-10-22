import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        int port = 1234;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from " + clientSocket.getInetAddress());

                // Create input and output streams
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Read the message from the client
                String clientMessage = in.readLine();
                System.out.println("Received from client: " + clientMessage);

                // Process the message and send a response
                if (clientMessage != null && clientMessage.startsWith("Hello My name is ")) {
                    String clientName = clientMessage.substring(19); // Extract the name
                    String response = "Walikum Salam " + clientName;
                    out.println(response);
                } else {
                    out.println("Invalid message format. Please send a message starting with 'Hello My name is'.");
                }

                // Close the client socket
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
