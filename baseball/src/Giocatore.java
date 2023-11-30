public class Giocatore {
    private int anni;
    private double abilita;
    private String nome;
    private static int DEF_ETA=0;
    private static int DEF_ABILITA=50;
    private static double MIN_ABILITA=0.0;
    private static double MAX_ABILITA=100.100;
    private Ruolo ruolo;

    public Giocatore(String nome, int eta, Ruolo ruolo){
        this.nome=nome;
        if(eta<0) {
            this.anni = DEF_ETA;
        }
        this.anni=eta;
        this.abilita=(double)(Math.random()*(MAX_ABILITA - MIN_ABILITA +1))+MIN_ABILITA;
        this.ruolo=ruolo;
    }
    public Giocatore(String nome, int eta, double valore, Ruolo ruolo){
        this.nome=nome;
        if(eta<0) {
            this.anni = DEF_ETA;
        }
        this.anni=eta;
        this.abilita=valore;
        this.ruolo=ruolo;
    }

    public String getNome() {
        return nome;
    }

    public double getAbilita() {
        return abilita;
    }

    public int getEta() {
        return anni;
    }

    public void setAnni(int eta) {
        this.anni= eta;
    }

    public void setAbilita(double abilita) {
        this.abilita = abilita;
    }

    public String toString(){
        return "giocatore:"+nome+" anni:"+anni+" punteggio:"+abilita;
    }

}
