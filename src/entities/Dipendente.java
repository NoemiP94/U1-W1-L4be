package entities;

public class Dipendente {
    //ATTRIBUTI
    public static double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;


    //GETTER E SETTER
    public int getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public double getImportoOrarioStabilito() {
        return this.importoOrarioStraordinario;
    }

    public void setImportoOrarioStabilito(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return this.livello;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //COSTRUTTORI
    public Dipendente(int matricola, Dipartimento dipartimento){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente( int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;

    }

    //METODI
    public void stampaDatiDipendente(){
        System.out.println("Matricola: " + this.matricola + ", stipendio: " + this.stipendio + ", importo straordinario: "
                + this.importoOrarioStraordinario + ", livello: " + this.livello + ", dipartimento: " + this.dipartimento );
    }

    public Livello promuovi(){
        switch(this.livello){
            case OPERAIO -> {
                this.livello = Livello.IMPIEGATO;
                this.stipendio = this.stipendio * 1.2;
            }
            case IMPIEGATO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = this.stipendio * 1.5;
            }
            case QUADRO -> {
                this.livello = Livello.DIRIGENTE;
                this.stipendio = this.stipendio * 2;
            }
            default -> System.err.println("Non si può promuovere un dirigente!");
        }
        return this.livello;
    }

    public static double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario){
        return dipendente.stipendio + dipendente.importoOrarioStraordinario * oreStraordinario;
    }

}