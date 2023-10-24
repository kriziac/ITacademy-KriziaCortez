package Sprint01.Tasca01.n1exercici1.Main;

import Sprint01.Tasca01.n1exercici1.entities.InstrumentsDeCorda;
import Sprint01.Tasca01.n1exercici1.entities.InstrumentsDeVent;
import Sprint01.Tasca01.n1exercici1.entities.InstrumentsDePercussio;

public class App {
     public static void main(String[] args) {

        InstrumentsDeCorda violin = new InstrumentsDeCorda("Violín", 100);
        InstrumentsDeCorda guitarra = new InstrumentsDeCorda("guitarra", 800);
       
        InstrumentsDePercussio maracas = new InstrumentsDePercussio("Maracas", 20);
        InstrumentsDePercussio cajon = new InstrumentsDePercussio("Cajón", 50);

        InstrumentsDeVent arpa = new InstrumentsDeVent("Arpa", 4000);
        InstrumentsDeVent trompeta = new InstrumentsDeVent("trompeta", 45);

        violin.tocar();
        guitarra.tocar();

        maracas.tocar();   
        cajon.tocar();


        arpa.tocar();
        trompeta.tocar();
    }
}
