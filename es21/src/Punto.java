public class Punto {
    private int x;
    private int y;

    public void Punto(int x, int y){
        setX(x);
        setY(y);
    }
    public void Punto(){
        setY(0);
        setX(0);
    }
    public void setX(int x){
        this.x=x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String toString(){
        return "X = " +getX() + "Y = " +getY();
}
}