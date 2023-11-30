public class Utenza {
    private String nome;
    private String cognome;
    private String numTelefono;
    private String email;
    private static final String DEFAULT_NUMERO = "000000000";

    public Utenza(String nome, String cognome, String numTelefono, String email){
        this.nome = nome;
        this.cognome = cognome;
        if(numTelefono.length() == 9)
            this.numTelefono = numTelefono;
        else
            this.numTelefono = DEFAULT_NUMERO;
        this.email = email;
    }
    public Utenza(String nome, String cognome, String numTelefono){
        this.nome = nome;
        this.cognome = cognome;
        if(numTelefono.length() == 9)
            this.numTelefono = numTelefono;
        else
            this.numTelefono = DEFAULT_NUMERO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumTelefono(String numTelefono){
        if(numTelefono.length() == 9)
            this.numTelefono = numTelefono;
        else
            this.numTelefono = numTelefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "Nome: " + nome + " Cognome: " + cognome + " Numero telefonico: " + numTelefono + " Email: "
                + email;
    }
}
