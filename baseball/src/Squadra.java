public class Squadra {

    private String nome;
    private Giocatore [] vGiocatori;
    private final int N_MAX;
    private final static int DEF_MAX=10;
    private int num_player;

    public Squadra(String nome, int max_player){
        this.nome=nome;
        if(max_player>0){
            N_MAX=max_player;
        }
        else{
            N_MAX=DEF_MAX;
        }
    }
//<>

    public void add(Giocatore giocatore) {
        if (giocatore != null) {
            if (num_player < N_MAX) {
                vGiocatori[num_player] = giocatore;
                num_player++;
            }
        }
    }


    public void setPunteggio(String nome, double valore) {
        for (int k = 0; k < num_player; k++) {
            if (vGiocatori[k].equals(nome)) {
                vGiocatori[k].setAbilita(valore);
            }
        }
    }

    public double getPunteggioMedio(){
        double somma=0.0;
        for (int k = 0; k < num_player; k++) {
            somma +=vGiocatori[k].getAbilita();
        }
        return somma/num_player;
    }

    public void passatoAnno(){
        for (int k = 0; k < num_player; k++) {
            vGiocatori[k].setAnni(vGiocatori[k].getEta()+1);
        }
    }

    public String toString(){
            String str = "";
            str = "Nome squadra: " + nome;
            for (int k = 0; k < num_player; k++) {
                str += vGiocatori[k].toString() + "\n";
            }
            str += " Punteggio medio: " + getPunteggioMedio();
            return str;
    }
}


