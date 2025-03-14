package model.producte;

import java.time.LocalDate;

public class Alimentacio extends Producte {
    private LocalDate dataCaducitat;

    public Alimentacio(String nom, double preu, String codiBarres, LocalDate dataCaducitat) {
        super(nom, preu, codiBarres);
        this.dataCaducitat = dataCaducitat;
    }

    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }
}
