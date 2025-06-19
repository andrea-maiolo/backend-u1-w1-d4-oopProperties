package entities;

import interfaces.Worker;

import java.util.Random;

public abstract class Dipendente implements Worker {
    protected Dipartimenti dipartimento;
    protected int matricola;
    protected double stipendio;

    public Dipendente(Dipartimenti d) {
        Random random = new Random();
        this.matricola = random.nextInt(100, 100000);
        this.dipartimento = d;
        this.stipendio = 0.00;
    }

    public int getMatricola() {
        return matricola;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void checkIn(int oraInizio) {
        System.out.println(oraInizio + ":00");
    }
}
