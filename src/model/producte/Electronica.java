package model.producte;

public class Electronica extends Producte {
    private int diesGarantia;

    public Electronica(String nom, double preu, String codiBarres, int diesGarantia) {
        super(nom, preu, codiBarres);
        this.diesGarantia = diesGarantia;
    }

    public int getDiesGarantia() {
        return diesGarantia;
    }

    @Override
    public String toString() {
        return super.toString() + " | Garantia: " + diesGarantia + " dies";
    }
}