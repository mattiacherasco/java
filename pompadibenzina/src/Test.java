public class Test {
    public static void main(String[] args) {
        Carburante carburante1=new Carburante();
        Carburante carburante2=new Carburante(tipoCarburante.GPL, 10);

        Distributore distributore1=new Distributore("cuneo", 10);
        distributore1.add(carburante1);
        distributore1.add(carburante2);
        System.out.println(distributore1.toString());
    }
}