public class Carburante {
    private final static String TipoCarburante[]= { "BENZINA", "DIESEL", "GPL", "METANO" };
    private String tipo;
    TipoCarburante tipoc;
    private float prezzo;

    private final static String DEF_TIPO="benzina";//static=condiviso da tutti gli oggetti
    private final static float DEF_PREZZO=1.5f;

    public Carburante() {
        tipo = DEF_TIPO;
        tipoc = DEF_TIPO;
        prezzo = DEF_PREZZO;
    }

    public Carburante(String tipo, float prezzo) {
        if (prezzo < 0) {
            this.prezzo=DEF_PREZZO;
        }
        this.prezzo = prezzo;
        if(isTipo(tipo)!=-1)
            this.tipo=tipo;
        this.tipo = DEF_TIPO;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Il prezzo del carburante non può essere negativo");
        }
    }

    private int isTipo(String tipo){
        int tro=0;
        int k=0;
        while(k< TipoCarburante.length && tro == -1){
            if(tipo.equals())
        }
    }

    public boolean equals(Carburante c){
        return (prezzo == c.getPrezzo());
    }

    public String toString() {
        return "Tipo: " + tipo + ", Prezzo: " + prezzo;
    }
}

