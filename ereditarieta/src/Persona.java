public class Persona {

    private String nome;
    private final static String NOME_DEF="Mattia";
    private String cognome;
    private final static String COGNOME_DEF="Cherasco";

    public Persona(String nome, String cognome){
        if(nome!=null){
            this.nome=nome;
        }else {
            this.nome = NOME_DEF;
        }
        if(nome!=null){
            this.cognome=cognome;
        }else {
            this.cognome = COGNOME_DEF;
        }
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return "nome: "+nome+" cognome: "+cognome;
    }
}