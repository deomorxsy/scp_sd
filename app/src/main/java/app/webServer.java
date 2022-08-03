import java.net.Socket;
import java.io.*;

public class webServer {
	public static void main(String[] args) {
        ServerSocket server = new ServerSocket(80);
        try {
            System.out.println("Startando in 127.0.0.1:80");
            Socket client = server.accept();
            System.out.println("Startado: ggwp");
        }
    }
}
