package vista;

public class Vista {
    public static void menu() {
        System.out.println("1. Gestió Magatzem i Compres");
        System.out.println("2. Introduir producte");
        System.out.println("3. Passar per caixa");
        System.out.println("4. Mostrar carro de la compra");
        System.out.println("0. Sortir");
    }

    public static void menuGestioMagatzemCompres() {
        System.out.println("1.1 Caducitat");
        System.out.println("1.2 Tiquet de compra");
        System.out.println("1.3 Composició textil");
        System.out.println("1.0 Tornar");
    }

    public static void menuIntroduirProducte() {
        System.out.println("2.1. Alimentació");
        System.out.println("2.2. Textil");
        System.out.println("2.3. Electrònica");
        System.out.println("2.0. Tornar");
    }

    public static void producte() {
        System.out.println("--------------\n-- PRODUCTE --\n--------------");
    }

    public static void inici() {
        System.out.println("------------\n-- INICI --\n------------");
    }
}