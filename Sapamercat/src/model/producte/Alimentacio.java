package model.producte;

public class Alimentacio extends Producte {
    private int dataCaducitat;

    public Alimentacio(String nom, double preu, String codiBarres, int dataCaducitat) {
        super(nom, preu, codiBarres);
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public int getDataCaducitat() {
        return dataCaducitat;
    }

    @Override
    public String toString() {
        return super.toString() + " | Data de caducitat: " + dataCaducitat;
    }
}