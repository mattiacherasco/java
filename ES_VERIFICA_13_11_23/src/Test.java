public class Test {
    public static void main(String[] args) {
        Veicolo car1 = new Veicolo("a000", "audi", "a4", "AA000AA");
        Veicolo car2 = new Veicolo("a001", "opel", "astra", "AA001AA");
        Veicolo car3 = new Veicolo("a002", "porsche", "macan", "AA002AA");
        Responsabile resp = new Responsabile("Andrea", "Sciolla", "04/05/06", "SCLNDR06E04D205X");
        Autonoleggio nol = new Autonoleggio("Sciollaauto", "viaCiao2", resp);
        nol.add(car1);
        nol.add(car2);
        nol.add(car3);
        System.out.println((nol.trovaVeicolo("AA002BA")).toString()); //c'erca se esiste il veicolo, se no stampa il primo

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(resp.toString());
        System.out.println(nol.toString());

    }
}
