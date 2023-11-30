public class AgendaTelefonica {
    private final int MAX_UTENZE;
    private final static int DEFAULT_UTENZE = 5;
    private int num_utenze;
    private Utenza[] vutenze;

    public AgendaTelefonica(int max_utenze){
        if(max_utenze > 0)
            MAX_UTENZE = max_utenze;
        else
            MAX_UTENZE = DEFAULT_UTENZE;
        num_utenze = 0;
        vutenze = new Utenza[MAX_UTENZE];
    }

    public void inserimentoUtenza(Utenza utenza){
        if(utenza != null){
            if(num_utenze < MAX_UTENZE){
                vutenze[num_utenze] = utenza;
                num_utenze++;
            }
        }
    }
    public Utenza ricercaUtenza(String nome){
        Utenza utenza = null;
        int tro = -1;
        int k = 0;
        while (k < num_utenze && tro == -1){
            if(vutenze[k].getNome() == nome) {
                utenza = vutenze[k];
                tro = 1;
            } else {
                k++;
            }
        }
        return utenza;
    }

    public Utenza cambiaNum(String nome, Strig numNuovo){
        vutenze[ricercaUtenza(nome)].numTelefono=numNuovo;
    }

    public String toString(){
        String str = "";
        for(int k = 0; k < num_utenze; k++){
            str += vutenze[k].toString() + "\n";
        }
        return "Utenze: \n" + str;
    }
}
