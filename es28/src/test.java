public class test {
    public static void main(String[] args) {

        Carburante a= new Carburante(Carburante.TipoCarburante.BENZINA, (float)2.5);
        Distributore distributore1= new Distributore("cervasca", "12010");
        System.out.println(distributore1.toString());
        distributore1.aumenta(Carburante.TipoCarburante.valueOf("BENZINA"), 10);
        distributore1.add(a);
        System.out.println(distributore1.toString());
    }
}