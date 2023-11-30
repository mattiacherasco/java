public class Test {
    public static void main(String[] args) {

        Dado dado1= new Dado(20);
        Dado dado2= new Dado();
        dado1.lanciaDado();
        dado2.lanciaDado();
        System.out.println("il primo dado è "+ dado1.getLancio());
        System.out.println("il secondo dado è "+ dado2.getLancio());

    }
}