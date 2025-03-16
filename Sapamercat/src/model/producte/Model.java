
package model.producte;

import java.util.Map;

    public class Model {

        /**
         * Mètode que calcula el total a pagar dels productes del carro de la compra.
         *
         * @param productes Map amb els productes del carro de la compra.
         */

        public static void pagar(Map<Integer, Producte> productes) {
            double total = 0.0;
            for (Producte producte : productes.values()) {
                total += producte.getPreu();
            }
            System.out.println("Total a pagar: " + total);
        }

        /**
         * Mètode que mostra el llistat de productes per data de caducitat.
         *
         * @param productes Map amb els productes del carro de la compra.
         */

        public static void introduirProducteCarro(Map<Integer, Producte> productes, Producte producte) {
            productes.put(producte.hashCode(), producte);
        }

        public static void mostrarCarroCompra(Map<Integer, Producte> productes) {
            if (productes.isEmpty()) {
                System.out.println("El carro de la compra està buit.");
            } else {
                for (Producte producte : productes.values()) {
                    System.out.println(producte);
                }
            }
        }

        public static void imprimirTiquet(Map<Integer, Producte> productes) {
            for (Producte producte : productes.values()) {
                System.out.println(producte);
            }
        }



        public static void mostrarComposicioTextil(Map<Integer, Producte> productes) {
            for (Producte producte : productes.values()) {
                if (producte instanceof Textil) {
                    System.out.println(producte);
                }
            }
        }
    }