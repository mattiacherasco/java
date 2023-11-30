public class Quadro {
    private String titolo;
    private String autore;
    private TipoTecnica tecnica;
    private float valore;
    private final static int DEF_VAL=10;

    public Quadro(String titolo, String autore, TipoTecnica tecnica, int valore){
        this.titolo=titolo;
        this.autore=autore;
        this.tecnica=tecnica;
        if(valore<0){
            this.valore=DEF_VAL;
        }else{
            this.valore=valore;
        }
    }
    public Quadro(String titolo, String autore, TipoTecnica tecnica){
        this.titolo=titolo;
        this.autore=autore;
        this.valore=DEF_VAL;
        this.tecnica=tecnica;
    }
    public Quadro(String titolo, String autore){
        this.titolo=titolo;
        this.autore=autore;
        this.valore=DEF_VAL;
        this.tecnica=TipoTecnica.OLIO;
    }
    public Quadro(String titolo, String autore, float valore){
        this.titolo=titolo;
        this.autore=autore;
        this.valore=valore;
        this.tecnica=TipoTecnica.OLIO;
    }

    public String getAutore() {
        return autore;
    }

    public void setValore(float valore) {
        if(valore>0) {
            this.valore = valore;
        }
    }

    public float getValore() {
        return valore;
    }

    public String getTitolo() {
        return titolo;
    }

    public TipoTecnica getTecnica() {
        return tecnica;
    }

    public boolean isParagonabile(Quadro q){
        return (valore==q.getValore() && tecnica==q.getTecnica());
    }

    public String toString() {
        return  "autore: "+autore+ "titolo:"+titolo+ "tecnica:"+tecnica+"valore:"+valore;
    }
}
