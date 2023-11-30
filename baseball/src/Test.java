public class Test {
    public static void main(String[] args) {

        Giocatore busso=new Giocatore("bussone", 18, 0.1, Ruolo.TERZA_BASE);
        Giocatore chera=new Giocatore("cherasco", 17, 4.9, Ruolo.BATTITORE);
        Squadra cuneo= new Squadra("cuneo", 10);

        cuneo.add(chera);
        cuneo.add(busso);
        System.out.println(cuneo.toString());

    }
}