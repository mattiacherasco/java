public class Figura {
    private String nome;
    private final int N_VERTICI_MAX;
    private Punto[] vPunti;
    private int n_vertici;

    public Figura() {
        N_VERTICI_MAX = 0;
        this.nome="NULL";
    }
    public Figura(int n_vertici_max, String nome){
        this.N_VERTICI_MAX=n_vertici_max;
        setNome(nome);
        vPunti= new Punto[N_VERTICI_MAX];
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setN_vertici(int n_vertici) {
        this.n_vertici = n_vertici;
    }

    public int getN_vertici() {
        return n_vertici;
    }
    public void add(Punto p){
        if(p != null){
            if(n_vertici<N_VERTICI_MAX){
                vPunti[n_vertici]=p;
                n_vertici++;
            }
        }
    }
    public int perimetro(){
        int perimetro=0;
        if(n_vertici>3){
            for(int k=0;k<n_vertici-1;k++){
                perimetro=perimetro+(int)Math.sqrt((vPunti[k].getX()-vPunti[k+1].getX())*(vPunti[k].getX()-vPunti[k+1].getX())+(vPunti[k].getY()-vPunti[k+1].getY())*(vPunti[k].getY()-vPunti[k+1].getY()));
            }        perimetro=perimetro+(int)Math.sqrt((vPunti[n_vertici-1].getX()-vPunti[0].getX())*(vPunti[n_vertici-1].getX()-vPunti[0].getX())+(vPunti[n_vertici-1].getY()-vPunti[0].getY())*(vPunti[n_vertici-1].getY()-vPunti[0].getY()));

        }
        return perimetro;
    }

    public String toString(){
        String s = " ";
        for(int k=0;k<n_vertici;k++){
            s += vPunti[k].toString()+ "; ";
        }
        return s + " perimetro " + this.nome + " = " + perimetro();
    }

}