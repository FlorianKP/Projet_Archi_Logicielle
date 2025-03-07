package documents;

import exceptions.EmpruntException;
import exceptions.ReservationException;
import main.Abonne;
import main.Document;

public class Livre implements Document {

    private int numero;
    private String titre;
    private boolean adulte;

    public Livre(int numero, String titre, boolean adulte) {
        this.numero = numero;
        this.titre = titre;
        this.adulte = adulte;
    }

    @Override
    public int numero() {
        return this.numero;
    }

    @Override
    public void reserver(Abonne ab) throws ReservationException {

    }

    @Override
    public void emprunter(Abonne ab) throws EmpruntException {

    }

    @Override
    public void retourner() {

    }
}
