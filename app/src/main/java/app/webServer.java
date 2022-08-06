package portAcad;

import java.net.*;
import java.io.*;
import java.util.*;



private static class webServer implements Callable<Void> {
    private Socket connection;

    webserver(Socket connection) {
        this.connection = connection
    }

    @Override
    public void call() {
        try {
            Writer out = new OutputStreamWriter(connection.getOutputStream());
            Date now = new Date();
            out.Write(now.toString() + "\r\n");
            out.flush();

        } catch (IOException ex) {
            System.err.println(ex);
         } finally {
            try {
                connection.close();
            } catch (IOException ex) {}
         }

        return null;
    }
