package entities;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(Dipartimenti d) {
        super(d);
    }

    public static void calculateSalary(DipendenteFullTime dip) {
        dip.stipendio = 1400;
    }
}
