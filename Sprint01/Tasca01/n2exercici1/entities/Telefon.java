package Sprint01.Tasca01.n2exercici1.entities;

public class Telefon {
    private String marca;
    private String model;


    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void call(String phoneNumber) {
        System.out.println("Currently calling :  " + phoneNumber);
    }
    
}


