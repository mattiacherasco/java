public class Test {
    public static void main(String[] args) {

        Giocatore giocatore1= new Giocatore("Mattia", 10);
        Giocatore giocatore2= new Giocatore("Luca", 30, 90.4);
        System.out.println(giocatore1.toString());
        giocatore1.setAbilita(18.09);
        System.out.println(giocatore1);
        System.out.println(giocatore2);

    }
}