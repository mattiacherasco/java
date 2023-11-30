public class Veicolo {
    private String codice;
    private String marca;
    private String modello;
    private String targa;

    public Veicolo(String cod, String marc, String mod, String targ){
        codice = cod;
        marca = marc;
        modello = mod;
        targa = targ;
    }
    public String getModello() {
        return modello;
    }
    public String getCodice() {
        return codice;
    }
    public String getMarca() {
        return marca;
    }
    public String getTarga() {
        return targa;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String toString(){
        return "codice: " + codice + "; targa: " + targa + "; modello: " + modello + "; marca: " + marca;
    }
}

