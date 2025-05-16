public class OsobniVozidlo {
    private final int pocetSedadel;
    private int pocetOsob;

    public OsobniVozidlo(int pocetSedadel, int pocetOsob) {
        this.pocetSedadel = pocetSedadel;
        this.pocetOsob = 0;
    }

    public void setPocetOsob(int pocetOsob) {
        if (pocetOsob >= 0 && pocetOsob <= pocetSedadel) {
            this.pocetOsob = pocetOsob;
        } else {
            throw new IllegalArgumentException("Počet osob musí být mezi 0 a " + pocetSedadel);
        }
    }

    public int getPocetOsob() {
        return pocetOsob;
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }

}
