public class Carburante {
    private float prezzo;
    private final static float DEF_PREZZO = 10;
    private tipoCarburante tipo;
//<>
    public Carburante(tipoCarburante tipo, float prezzo){
        this.tipo=tipo;
        if(prezzo<=0){
            this.prezzo=DEF_PREZZO;
        }else{
            this.prezzo=prezzo;
        }
    }
    public Carburante(){
        this.tipo=tipoCarburante.DEFAULT;
        this.prezzo=DEF_PREZZO;
    }

    public void setPrezzo(float prezzo) {
        if(prezzo>0){
            this.prezzo = prezzo;
        }
    }
    public void setTipo(tipoCarburante tipo){
        this.tipo=tipo;
    }

    public float getPrezzo(){return prezzo;}
    public tipoCarburante getTipo(){return tipo;}

    public boolean isEquals(Carburante c){
        if(c.prezzo==getPrezzo()) {
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return " di carburante "+getTipo()+" ha un prezzo di "+getPrezzo();
    }

}
