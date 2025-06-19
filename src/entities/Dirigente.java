package entities;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimenti d) {
        super(d);
    }

    public static void calculateSalary(Dirigente dir, int totaleAnno, int spese) {
        int bonus = 10000;
        if (totaleAnno - spese > 1000) {
            dir.stipendio = 10000 + bonus;
        } else {
            dir.stipendio = 5000;
        }
    }
}
