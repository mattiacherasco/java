public class Test {
    public static void main(String[] args) {
        Auto supra = new Auto("supra", 100, TipoColore.BIANCO);
        Auto r34 = new Auto("r34", 120, TipoColore.BIANCO);
        Concessionaria toyota = new Concessionaria("cuneo", 10);

        toyota.add(supra);
        toyota.add(r34);
        System.out.println(toyota.toString());

    }

}