public class Test {
    public static void main(String[] args) {
        Punto p1= new Punto(2,10);
        Punto p2= new Punto(2,6);
        Punto p3= new Punto(6,6);
        Punto p4= new Punto(6,10);
        Figura f= new Figura(4,"poligono");
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        System.out.println(f.toString());
    }
}
