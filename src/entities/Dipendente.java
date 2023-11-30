package entities;

public class Dipendente {
    //ATTRIBUTI
    public int stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStabilito;
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
        return this.importoOrarioStabilito;
    }

    public void setImportoOrarioStabilito(double importoOrarioStabilito) {
        this.importoOrarioStabilito = importoOrarioStabilito;
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
        this.stipendio = stipendioBase;
        this.importoOrarioStabilito = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(int stipendioBase, int matricola, double stipendio, double importoOrarioStabilito, Livello livello, Dipartimento dipartimento){
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStabilito = importoOrarioStabilito;
        this.livello = Livello.OPERAIO;
        this.dipartimento = Dipartimento.AMMINISTRAZIONE;

    }
}