package Sprint01.Tasca01.n1exercici2.entities;

public class Cotxe {
     // No puede ser modificado
        public static final String marca = "Seat";
        // Se puede modificar
        public String model;
        // Se puede inicializar con constructor
        public final int potencia;
    
        // Constructor para inicializar el modelo y la potencia
        public Cotxe(String model, int potencia) {
            this.model = model;
            this.potencia = potencia;
        }
    
        // Métodos
        public static void accelerar() {
            System.out.println("El vehicle està accelerant");
        }
    
        public void frenar() {
            System.out.println("El vehicle està frenant");
        }
    }