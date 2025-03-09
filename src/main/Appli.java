package main;

import java.io.IOException;

public class Appli {
    public static void main(String[] args) throws IOException {
        new Thread(new ServeurGeneral()).start();
    }
}
