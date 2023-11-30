public class Test {
    public static void main(String[] args) {
        Quadro quadro1=new Quadro("gioconda", "mattia", TipoTecnica.ACQUERELLO,20);
        Quadro quadro2=new Quadro("girotondo", "sciolla", TipoTecnica.ACQUERELLO, 20);
        Pinacoteca pinacoteca1=new Pinacoteca("cuneo", 10);
        pinacoteca1.add(quadro1);
        pinacoteca1.add(quadro2);
        System.out.println(pinacoteca1.getValoreMedio());
        System.out.println(pinacoteca1.toString());
    }
}