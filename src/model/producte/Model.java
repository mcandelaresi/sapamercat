package model.producte;

import java.util.List;
import java.util.Map;

public class Model {
    public static void afegirProducte(List<Producte> carro, Producte producte) {
        carro.add(producte);
    }

    public static void pagar(Map<Integer, Producte> productes) {
        double total = 0;
        for (Producte producte : productes.values()) {
            total += producte.getPreu();
            System.out.println(producte);
        }
        System.out.println("Total a pagar: " + total);
    }

    public static void mostrarCarroCompra(List<Producte> carro) {
        for (Producte producte : carro) {
            System.out.println(producte);
        }
    }

    public static void imprimirTiquet(Map<Integer, Producte> productes) {
        double total = 0;
        for (Producte producte : productes.values()) {
            total += producte.getPreu();
            System.out.println(producte);
        }
        System.out.println("Total a pagar: " + total);
    }

    public static void mostrarComposicioTextil(Map<Integer, Producte> productes) {
        for (Producte producte : productes.values()) {
            if (producte instanceof Textil) {
                System.out.println(((Textil) producte).getComposicioTextil());
            }
        }
    }

    public static void introduirProducteCarro(List<Producte> carro, Producte producte) {
        carro.add(producte);
    }
}