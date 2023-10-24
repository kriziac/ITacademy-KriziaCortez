package Sprint01.Tasca01.n1exercici2.Main;

import Sprint01.Tasca01.n1exercici2.entities.Cotxe;

public class App {
     public static void main(String[] args) {

        // Creo un nuevo coche con los atributos que si se pueden modificar
      Cotxe newCar = new Cotxe("Ibiza", 300);

    System.out.println("Marca del coche: " + Cotxe.marca);
    System.out.println("Modelo del coche: " + newCar.model);
    System.out.println("Potencia del coche: " + newCar.potencia);
    


    //Métodos
        Cotxe.accelerar();
        newCar.frenar();
    }
}


