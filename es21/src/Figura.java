public class Figura {
    private String nome;
    private final int N_VERTICI_MAX;
    private Punto[] vPunti;
    private int n_vertici;

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

            }
        }
    }
}