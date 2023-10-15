import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 12345;

        try {
            Socket clientSocket = new Socket(host, port);
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);

            while (true) {
                System.out.print("Enter a string (or 'exit' to quit): ");
                String input = reader.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                out.writeUTF(input);

                String response = in.readUTF();
                System.out.println("Server's response: " + response);
            }

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
