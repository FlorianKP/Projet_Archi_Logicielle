package main;

import java.io.IOException;
import java.net.ServerSocket;

public class ServeurGeneral implements Runnable {
    private ServerSocket servReservationSocket;
    private ServerSocket servEmpruntSocket;
    private ServerSocket servRetourSocket;

    public ServeurGeneral() throws IOException {
        servReservationSocket = new ServerSocket(2000);
        servEmpruntSocket = new ServerSocket(3000);
        servRetourSocket = new ServerSocket(4000);
    }

    @Override
    public void run() {
        while(true) {
            try {
                new Thread(new ServiceReservation(servReservationSocket.accept())).start();
                new Thread(new ServiceEmprunt(servEmpruntSocket.accept())).start();
                new Thread(new ServiceRetour(servRetourSocket.accept())).start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
