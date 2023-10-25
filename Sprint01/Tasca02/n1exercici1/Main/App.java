package Sprint01.Tasca02.n1exercici1.Main;
import Sprint01.Tasca02.n1exercici1.entities.*;
import Sprint01.Tasca02.n1exercici1.exceptions.*;

public class App {
    public static void main(String[] args) {
        try {
            
            //Descomentar para verificar que PreuTotal funciona
          Producte newProducte1 = new Producte("Coche", 90);
           Producte newProducte2 = new Producte("Libro", 30);

            Venda venda = new Venda();

            //Descomentar para verificar que el metodo Agregar Producto sirve
            venda.afegirProducte(newProducte1);
          venda.afegirProducte(newProducte2);

            venda.calcularTotal();

            System.out.println("Preu total de la venda: " + venda.getPreuTotal());

        } catch (VendaBuidaException except) {
          
            System.out.println("Error: " + except.getMessage());
        }
    }
}





