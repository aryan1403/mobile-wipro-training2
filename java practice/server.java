import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    private Socket socket = null;
    private DataInputStream input = null;
    private ServerSocket server = null;

    public server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for the client...");

            socket = server.accept(); // accept the clien to connect

            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            System.out.println(input.readUTF());

            System.out.println("Connection closed");
            socket.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        server s = new server(8000);
    }
}
