package entities;

import interfaces.Worker;

public class Volontario implements Worker {
    String nome;
    int eta;
    String cv;

    public Volontario(String nome, int eta, String cv) {
        this.cv = cv;
        this.eta = eta;
        this.nome = nome;
    }

    public void checkIn(int oraInizio) {
        System.out.println(oraInizio + ":00");
    }
}
