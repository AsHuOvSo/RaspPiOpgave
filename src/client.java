import java.io.*;
import java.net.*;
import java.util.*;

public class client {

    public static void main(String[] args) {

        Socket socket = null;
        DataInputStream in = null;
        PrintStream out = null;

        try {
            socket = new Socket("192.168.1.134",4501);
            out = new PrintStream(socket.getOutputStream());
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: hostname");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }

        try {
            if (socket != null && out != null && in != null) {
                while(true) {
                    System.out.println("Please input your command ");
                    Scanner scanner = new Scanner(System.in);
                    String command = scanner.nextLine();

                    System.out.println("Sending command to client: " + command);
                    out.print(command);

                    byte[] bytes = new byte[1024];

                    in.read(bytes);
                    String reply = new String(bytes, "UTF-8");
                    System.out.println("Reply from server: " + reply.trim());
                }
            }

            socket.close();
            System.out.println("Connections closed successfully");
        }
        catch (IOException e) {
            System.err.println("IOException:  " + e);
        }
    }
}
