package model.producte;

public class Textil extends Producte {
    private String composicioTextil;

    /**
     * Constructor de la classe Textil
     * @param nom Nom del producte
     * @param preu Preu del producte
     * @param codiBarres Codi de barres del producte
     * @param composicioTextil Composició del producte
     */

    public Textil(String nom, double preu, String codiBarres, String composicioTextil) {
        super(nom, preu, codiBarres);
        this.composicioTextil = composicioTextil;
    }

    public String getComposicioTextil() {
        return composicioTextil;
    }

    @Override
    public int getDataCaducitat() {
        return 99999999;
    }

    @Override
    public String toString() {
        return super.toString() + " | Composició: " + composicioTextil;
    }
}