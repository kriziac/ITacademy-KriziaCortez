package Sprint01.Tasca01.n1exercici1.entities;

public class InstrumentsDePercussio{
    private String nom;
    private double preu;

    public InstrumentsDePercussio(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de percussió, anomenat " + nom + " y costa : " +
        preu);
     
    }
}
