public class Test {
    public static void main(String[] args) {

        Giocatore giocatore1= new Giocatore("Mattia", 10);
        Giocatore giocatore2= new Giocatore("Luca", 30, 90);
        System.out.println(giocatore1.toString());
        giocatore1.setAbilita(80);
        System.out.println(giocatore1);
        System.out.println(giocatore2);

    }
}