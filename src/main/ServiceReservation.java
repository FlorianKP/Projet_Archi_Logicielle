package main;

import java.io.Serializable;
import java.net.Socket;

public class ServiceReservation implements Runnable {
    private Socket socketClient;

    public ServiceReservation(Socket socketClient) {
        this.socketClient = socketClient;
    }
    @Override
    public void run() {

    }
}
