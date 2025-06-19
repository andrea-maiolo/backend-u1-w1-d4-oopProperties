import entities.*;
import interfaces.Worker;

public class Main {
    public static void main(String[] args) {
//        Dipendente a = new Dipendente(Dipartimenti.PRODUZIONE);
//        Dipendente b = new Dipendente(Dipartimenti.AMMINISTRAZIONE);
//        Dipendente c = new Dipendente(Dipartimenti.VENDITE);
//
//        Dipendente[] team = {a, b, c};
//        for (int i = 0; i < team.length; i++) {
//            System.out.println(team[i].getMatricola());
//        }

        DipendenteFullTime a = new DipendenteFullTime(Dipartimenti.VENDITE);
        DipendentePartTime b = new DipendentePartTime(Dipartimenti.PRODUZIONE);
        Dirigente c = new Dirigente(Dipartimenti.AMMINISTRAZIONE);

        Dipendente[] team = {a, b, c};
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getMatricola());
        }

        //giorno di paga
        DipendenteFullTime.calculateSalary(a);
        DipendentePartTime.calculeSalary(b, 27);
        Dirigente.calculateSalary(c, 4000, 2000);

        for (Dipendente dipendente : team) {
            System.out.println(dipendente.getStipendio());
        }

        Volontario v = new Volontario("peppino", 20, "non s come si fa un cv");

        Worker[] chiLavoraOggi = {a, v, b, c};

        for (int i = 0; i < chiLavoraOggi.length; i++) {
            int oraArrivo = 8;
            chiLavoraOggi[i].checkIn(i + oraArrivo);
        }
    }
}
