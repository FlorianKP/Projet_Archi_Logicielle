package main;

import java.net.Socket;

public class ServiceEmprunt implements Runnable {
    private Socket socketClient;

    public ServiceEmprunt(Socket socketClient) {
        this.socketClient = socketClient;
    }
    @Override
    public void run() {

    }
}
