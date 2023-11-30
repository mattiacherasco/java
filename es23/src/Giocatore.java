public class Giocatore {
    private int anni;
    private double abilita;
    private String nome;
    private static int DEF_ETA=18;
    private static int DEF_ABILITA=50;
    private static int MIN_ABILITA=0;
    private static int MAX_ABILITA=100;

    public Giocatore(String nome, int eta){
        this.nome=nome;
        if(eta<10) {
            this.anni = DEF_ETA;
        }
        this.anni=eta;
        this.abilita=(int)(Math.random()*(MAX_ABILITA - MIN_ABILITA +1))+MIN_ABILITA;
    }

    public Giocatore(String nome, int eta, int abilita){
        this.nome=nome;
        if(eta<10) {
            this.anni = DEF_ETA;
        }
        this.anni=eta;
        if(abilita<0.0){
            this.abilita=(double)(Math.random()*(MAX_ABILITA - MIN_ABILITA +1))+MIN_ABILITA;
        }
        this.abilita=abilita;

    }

    public String getNome(){return nome;}

    public double getAbilita(){return abilita;}

    public void setAbilita(int abilita){
        if(abilita<0.0){
            this.abilita=(double)(Math.random()*(MAX_ABILITA - MIN_ABILITA +1))+MIN_ABILITA;
        }
        this.abilita=abilita;
    }

    public int getEta(){return anni;}

    public void setEta(int eta){
        if(eta<10) {
            this.anni = DEF_ETA;
        }
        this.anni=eta;
    }

    public String toString() {
        return nome + " di "+anni +" anni ha un abilità in battuta di: " + abilita;
    }
}
