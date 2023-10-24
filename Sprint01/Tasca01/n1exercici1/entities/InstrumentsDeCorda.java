package Sprint01.Tasca01.n1exercici1.entities;

public class InstrumentsDeCorda {
    private String nom;
    private double preu;

    public InstrumentsDeCorda(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de corda, anomenat" + nom + " y costa : " +
        preu);
     
    }
}
