public class Dodavka extends OsobniVozidlo {
    private final int uzitecnaHmotnost;
    private int hmotnostNakladu;

    public Dodavka(int pocetSedadel, int pocetOsob, int uzitecnaHmotnost, int hmotnostNakladu) {
        super(pocetSedadel = 2, pocetOsob);
        this.uzitecnaHmotnost = 500;
        this.hmotnostNakladu = hmotnostNakladu;
    }

    public int getUzitecnaHmotnost() {
        return uzitecnaHmotnost;
    }

    public int getHmotnostNakladu() {
        return hmotnostNakladu;
    }

    public void setHmotnostNakladu(int hmotnostNakladu) {
        this.hmotnostNakladu = hmotnostNakladu;
    }
}
