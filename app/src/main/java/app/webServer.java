package portAcad;
import portAcad.*;

import java.net.*;
import java.io.*;
import java.util.concurrent.*; //for Callable
import java.util.concurrent.ExecutorService;
import java.util.Date;


class webServer implements Callable<Void> {
    private Socket connection;

    webServer(Socket connection) {
        this.connection = connection;
    }

    //@Override
    public Void call() {
        try {
            Writer out = new OutputStreamWriter(connection.getOutputStream());
            Date now = new Date();
            out.write(now.toString() + "\r\n");
            out.flush();

        } catch (IOException ex) {
            System.err.println(ex);
         } finally {
            try {
                connection.close();
            } catch (IOException e) {}
         }

        return null;
    }

}
