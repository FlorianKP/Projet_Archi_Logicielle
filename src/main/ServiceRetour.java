package main;

import java.net.Socket;

public class ServiceRetour implements Runnable {
    private Socket socketClient;

    public ServiceRetour(Socket socketClient) {
        this.socketClient = socketClient;
    }

    @Override
    public void run() {

    }
}
