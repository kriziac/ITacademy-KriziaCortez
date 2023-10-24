package Sprint01.Tasca01.n2exercici1.Main;
import Sprint01.Tasca01.n2exercici1.entities.Smartphone;



public class App {

    public static void main(String[] args) {
        // Crear un objeto de la clase Teléfono
        Smartphone newSmartphone = new Smartphone("Apple", "Iphone 15");
        
        //metodos

        newSmartphone.call("44444444");

        newSmartphone.fotografiar();
        
        newSmartphone.alarma();
    }
}


