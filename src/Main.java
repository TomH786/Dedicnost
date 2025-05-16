public class Main {
    public static void main(String[] args) {
        OsobniVozidlo vozidlo = new OsobniVozidlo(5, 0);
        OsobniVozidlo vozidlo2 = new OsobniVozidlo(6, 0);
        vozidlo.setPocetOsob(3);
        vozidlo2.setPocetOsob(6);

        //System.out.println("Počet sedadel: " + vozidlo.getPocetSedadel());
        //System.out.println("Počet osob: " + vozidlo.getPocetOsob());

        Dodavka dodavka = new Dodavka(2, 0, 500, 300);
        Dodavka dodavka2 = new Dodavka(2, 0, 600, 400);
        dodavka.setPocetOsob(1);
        dodavka2.setPocetOsob(2);

        //System.out.println("Počet sedadel dodávky: " + dodavka.getPocetSedadel());
        //System.out.println("Počet osob dodávky: " + dodavka.getPocetOsob());
        //System.out.println("Užitečná hmotnost dodávky: " + dodavka.getUzitecnaHmotnost());

        SeznamVozidel seznamVozidel = new SeznamVozidel();
        seznamVozidel.add(vozidlo);
        seznamVozidel.add(dodavka);
        seznamVozidel.add(vozidlo2);
        seznamVozidel.add(dodavka2);

        System.out.println("Počet vozidel v seznamu: " + seznamVozidel.size());

        for (OsobniVozidlo auto : seznamVozidel) {
            System.out.println("Vozidlo: " + auto.getClass().getSimpleName());
            System.out.println("Počet sedadel: " + auto.getPocetSedadel());
            System.out.println("Počet osob: " + auto.getPocetOsob());
            System.out.println("----------------------");
        }



    }
}