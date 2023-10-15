import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 12345;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is listening...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

                String clientMessage = in.readUTF();
                String result = countMaxChar(clientMessage);
                out.writeUTF(result);

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String countMaxChar(String input) {
        input = input.toLowerCase();
        int maxCount = 0;
        StringBuilder result = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == c) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = new StringBuilder(c + ":" + count);
            } else if (count == maxCount && count > 0) {
                result.append(", ").append(c).append(":").append(count);
            }
        }

        return result.toString();
    }
}
