public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        setX(x);
        setY(y);
    }
    public Punto(){
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
        return "(" + this.x + "," + this.y +")";
    }
}
