public class Test {
    public static void main(String[] args) {        //static=può essere invocato senza avere istantze della classe a cui appartiene
        Mostro mio;
        mio = new Mostro("bobby spina", 10, 100, 6);//new fa una malloc e va quindi a occpuare spazio in memoria


        Mostro tuo=new Mostro("il mago");

        //sout e da la print(ln manda a capo)
        System.out.println("il mio mostro ora è "
                + mio.toString());

        System.out.println("il tuo mostro ora è "
                + tuo.toString());
/*
        mio.setVita(mio.getVita() + 1); //aumenta la vita di uno

        System.out.println("il mio mostro ora è "
                + mio.toString());
                */
        mio.gioca(tuo);
    }
}
