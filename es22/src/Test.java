public class Test {
    public static void main(String[] args) {
        Auto auto1 = new Auto("bmw", "nero", 150000);
        Auto auto2 = new Auto("ferrari", "rosso", 200000);
        Concessionaria concessionaria = new Concessionaria("Bramardi", 10);
        concessionaria.add(auto1);
        concessionaria.add(auto2);
        System.out.println(concessionaria.toString());
        System.out.println("Valore totale auto: " + concessionaria.getSommaPrezzi());
        concessionaria.getColoriAutoModello("bmw");
        concessionaria.getColoriAutoModello("ferrari"); 
}
}
