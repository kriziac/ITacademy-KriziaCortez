package Sprint01.Tasca02.n1exercici1.entities;
import java.util.ArrayList;

import Sprint01.Tasca02.n1exercici1.exceptions.VendaBuidaException;

public class Venda {

    private ArrayList <Producte> productos;
    private double preuTotal;

    public Venda() {
        this.productos = new ArrayList<>();
        this.preuTotal = 0;
    }

    public void afegirProducte(Producte producte) {
        this.productos.add(producte);
    }



    public void calcularTotal() throws VendaBuidaException {
        if (productos.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        } else{

        for (Producte producte : productos) {
            preuTotal += producte.getPreu();
        }
    }
    }

    public double getPreuTotal() {
        return preuTotal;
    }
}
