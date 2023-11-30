public class Test {
    public static void main(String[] args) {
        Utenza utenza = new Utenza("Mattia", "Cherasco", "3666616216", "mattiacherasco@gmail.com");
        Utenza utenza1 = new Utenza("Luca", "Armando", "000000000");

        AgendaTelefonica agendaTelefonica = new AgendaTelefonica(5);
        agendaTelefonica.inserimentoUtenza(utenza);
        agendaTelefonica.inserimentoUtenza(utenza1);
        System.out.println(agendaTelefonica.ricercaUtenza("mattia").toString());
        agendaTelefonica.cambiaNum("mattia", "3313309799")
        System.out.println(agendaTelefonica.toString());
    }
}