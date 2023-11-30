public class Responsabile {
    private String nome;
    private String cognome;
    private String data;
    private String codiceFiscale;
    public Responsabile(String nom, String cog, String data, String codice){
        nome = nom;
        cognome = cog;
        this.data = data;
        codiceFiscale = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { //c'è solo il set nome perche una persona non può cambiare cognome o data di nascita
        this.nome = nome;
    }

    public void setCodiceFiscale(String codiceFiscale) { //quando cambia nome può cambiare codice fiscale
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String getCognome() {
        return cognome;
    }
    public String getData() {
        return data;
    }
    public String toString(){
        return "nome: " + nome + "; cognome: " + cognome + "; data di nascita: " + data + "; codiceFiscale: " + codiceFiscale;
    }
}
