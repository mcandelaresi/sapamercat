package model.producte;

    /**
     * Classe que representa un producte.
     */
    public abstract class Producte implements Comparable<Producte> {
        private String nom;
        private double preu;
        private String codiBarres;

        public Producte(String nom, double preu, String codiBarres) {
            this.nom = nom;
            this.preu = preu;
            this.codiBarres = codiBarres;
        }

        public abstract int getDataCaducitat();

        /**
         * Obté el nom del producte.
         * @return el nom del producte
         */
        public String getNom() {

            return nom;
        }

        /**
         * Estableix el nom del producte.
         * @param nom el nom del producte
         */
        public void setNom(String nom) {
            this.nom = nom;
        }

        /**
         * Obté el preu del producte.
         * @return el preu del producte
         */
        public double getPreu() {
            return preu;
        }

        /**
         * Estableix el preu del producte.
         * @param preu el preu del producte
         */
        public void setPreu(double preu) {

            this.preu = preu;
        }

        /**
         * Obté el codi de barres del producte.
         * @return el codi de barres del producte
         */
        public String getCodiBarres() {

            return codiBarres;
        }

        /**
         * Estableix el codi de barres del producte.
         * @param codiBarres el codi de barres del producte
         */
        public void setCodiBarres(String codiBarres) {

            this.codiBarres = codiBarres;
        }

        @Override
        public String toString() {

            return nom + " | " + preu + "€";
        }

        @Override
        public int compareTo(Producte other) {

            return this.nom.compareTo(other.nom);
        }
    }