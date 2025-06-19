package entities;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(Dipartimenti d) {
        super(d);
    }

    public static void calculeSalary(DipendentePartTime dip, int oreLavorate) {
        dip.stipendio = 8 * oreLavorate;
    }
}
