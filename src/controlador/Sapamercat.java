package controlador;

import excepcions.*;
import model.producte.*;
import vista.Vista;

import java.time.LocalDate;
import java.util.*;

public class Sapamercat {
    private static final int MAX_PRODUCTES = 100;
    private static List<Producte> carroCompra = new ArrayList<>();
    private static Map<Integer, Producte> productes = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio = -1;

        do {
            Vista.menu();
            try {
                opcio = scanner.nextInt();
                scanner.nextLine();

                switch (opcio) {
                    case 1:
                        gestioMagatzemCompres(scanner);
                        break;
                    case 2:
                        introduirProducte(scanner);
                        break;
                    case 3:
                        passarPerCaixa();
                        break;
                    case 4:
                        mostrarCarroCompra();
                        break;
                    case 0:
                        System.out.println("Sortint de l'aplicació...");
                        break;
                    default:
                        System.out.println("Opció no vàlida. Si us plau, tria una altra opció.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no vàlida.");
                scanner.nextLine();
            }
        } while (opcio != 0);
    }

    private static void gestioMagatzemCompres(Scanner scanner) {
        int opcio = -1;
        do {
            Vista.menuGestioMagatzemCompres();
            try {
                opcio = scanner.nextInt();
                scanner.nextLine();

                switch (opcio) {
                    case 1:
                        llistatPerCaducitat();
                        break;
                    case 2:
                        Model.imprimirTiquet(productes);
                        break;
                    case 3:
                        Model.mostrarComposicioTextil(productes);
                        break;
                    case 0:
                        System.out.println("Tornem al menú principal");
                        break;
                    default:
                        System.out.println("Opció no vàlida. Tria una altra opció.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no vàlida.");
                scanner.nextLine();
            }
        } while (opcio != 0);
    }

    private static void llistatPerCaducitat() {
        List<Alimentacio> alimentacioList = new ArrayList<>();

        for (Producte producte : productes.values()) {
            if (producte instanceof Alimentacio) {
                alimentacioList.add((Alimentacio) producte);
            }
        }

        alimentacioList.sort(Comparator.comparing(Alimentacio::getDataCaducitat));
        alimentacioList.forEach(System.out::println);
    }

    private static void introduirProducte(Scanner scanner) {
        int opcio = -1;
        do {
            Vista.menuIntroduirProducte();
            try {
                opcio = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nom: ");
                String nom = scanner.nextLine();
                System.out.print("Preu: ");
                double preu = scanner.nextDouble();
                if (preu < 0) throw new NegatiuException("El preu no pot ser negatiu.");
                System.out.print("Codi de barres: ");
                String codiBarres = scanner.next();
                scanner.nextLine();

                switch (opcio) {
                    case 1:
                        System.out.print("Data de caducitat (YYYY-MM-DD): ");
                        LocalDate dataCaducitat = LocalDate.parse(scanner.nextLine());
                        Model.introduirProducteCarro(carroCompra, new Alimentacio(nom, preu, codiBarres, dataCaducitat));
                        break;
                    case 2:
                        System.out.print("Composició tèxtil: ");
                        String composicioTextil = scanner.nextLine();
                        Model.introduirProducteCarro(carroCompra, new Textil(nom, preu, codiBarres, composicioTextil));
                        break;
                    case 3:
                        System.out.print("Dies de garantia: ");
                        int diesGarantia = scanner.nextInt();
                        Model.introduirProducteCarro(carroCompra, new Electronica(nom, preu, codiBarres, diesGarantia));
                        break;
                    case 0:
                        System.out.println("Tornant al menú principal...");
                        break;
                    default:
                        System.out.println("Opció no vàlida. Si us plau, tria una altra opció.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no vàlida.");
                scanner.nextLine();
            } catch (NegatiuException e) {
                System.out.println(e.getMessage());
            }
        } while (opcio != 0);
    }

    private static void passarPerCaixa() {
        try {
            if (productes.size() > MAX_PRODUCTES) throw new LimitProductesException("S'ha superat el límit de productes.");
            Model.pagar(productes);
            carroCompra.clear();
        } catch (LimitProductesException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarCarroCompra() {
        Model.mostrarCarroCompra(carroCompra);
    }
}