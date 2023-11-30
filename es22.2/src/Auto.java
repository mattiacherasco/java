public class Auto {

    private String modello;
    private float prezzo;
    private TipoColore colore;
    private final static int DEF_PREZZO=10;

    public Auto(String modello, float prezzo, TipoColore colore){
        this.modello=modello;
        if(prezzo<0){
            this.prezzo=DEF_PREZZO;
        }else{
            this.prezzo=prezzo;
        }
        this.colore=colore;
    }
    public Auto(String modello, float prezzo){
        this.modello=modello;
        if(prezzo<0){
            this.prezzo=DEF_PREZZO;
        }else{
            this.prezzo=prezzo;
        }
        this.colore=TipoColore.GRIGIO;
    }

    public void setPrezzo(float prezzo) {
        if(prezzo>0){
            this.prezzo=prezzo;
        }
    }

    public void setColore(TipoColore colore) {
        this.colore = colore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public String getModello() {
        return modello;
    }

    public TipoColore getColore() {
        return colore;
    }

    public String toString(){
        return "modello: "+modello+" colore: "+colore+" prezzo: "+prezzo;
    }
}
