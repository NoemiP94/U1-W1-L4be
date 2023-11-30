import entities.Dipartimento;
import entities.Dipendente;
import entities.Livello;

import static entities.Dipendente.calcolaPaga;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(123456,25500, 3, Livello.OPERAIO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente(123457,25500, 2, Livello.OPERAIO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(123458,28000, 1, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
        Dipendente dipendente4 = new Dipendente(123459,35000, 3, Livello.DIRIGENTE, Dipartimento.VENDITE);

        dipendente1.promuovi();
        dipendente3.promuovi();

        dipendente1.stampaDatiDipendente();
        dipendente2.stampaDatiDipendente();
        dipendente3.stampaDatiDipendente();
        dipendente4.stampaDatiDipendente();

        double pagaTotale1 = calcolaPaga(dipendente1, 5);
        double pagaTotale2 = calcolaPaga(dipendente2, 5);
        double pagaTotale3 = calcolaPaga(dipendente3, 5);
        double pagaTotale4 = calcolaPaga(dipendente4, 5);

        System.out.println("Lo stipendio totale é: " + pagaTotale1 + " €");
        System.out.println("Lo stipendio totale é: " + pagaTotale2 + " €");
        System.out.println("Lo stipendio totale é: " + pagaTotale3 + " €");
        System.out.println("Lo stipendio totale é: " + pagaTotale4 + " €");
    }


}