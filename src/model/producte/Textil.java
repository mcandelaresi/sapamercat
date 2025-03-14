package model.producte;

public class Textil extends Producte {
    private String composicioTextil;

    public Textil(String nom, double preu, String codiBarres, String composicioTextil) {
        super(nom, preu, codiBarres);
        this.composicioTextil = composicioTextil;
    }

    public String getComposicioTextil() {
        return composicioTextil;
    }

    @Override
    public String toString() {
        return super.toString() + " | Composició: " + composicioTextil;
    }
}