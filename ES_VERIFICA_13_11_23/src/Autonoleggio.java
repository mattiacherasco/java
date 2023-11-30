public class Autonoleggio {
    private String nome;
    private String indirizzo;
    private Responsabile resp;
    private Veicolo[] veicoli;
    private static final int MAX_VETTURE = 2000;
    private int numAuto;

    public Autonoleggio(String nome, String ind, Responsabile resp){
        this.nome = nome;
        indirizzo = ind;
        this.resp = resp;
        veicoli = new Veicolo[MAX_VETTURE];
        numAuto = 0;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Responsabile getResp() {
        return resp;
    }
    public void setResp(Responsabile resp) {
        this.resp = resp;
    }

    public void add(Veicolo v){  //boolean?
        if(v != null && numAuto < MAX_VETTURE){
            veicoli[numAuto] = v;
            numAuto++;
        }
    }

    public Veicolo trovaVeicolo(String targa) {
        int k = 0;
        boolean tro = false;
        while (k < numAuto && !tro) {
            if (veicoli[k].getTarga() == targa)
                tro = true;
            else
                k++;
        }
        if(tro) {
            return veicoli[k];
        }
        else
            return veicoli[0];
    }
    public Veicolo[] trovaTuttiVeicoli(){
        Veicolo[] v = new Veicolo[numAuto];
        for(int k = 0; k < numAuto; k++){
            v[k] = veicoli[k];
        }
        return v;
    }
    public String toString(){
        String s = "";
        for(int k = 0; k < numAuto; k++){
            s += veicoli[k].toString() + "\n";
        }
        return "nome: " + nome + "; indirizzo: " + indirizzo + ";\n\n RESPONSABILE: \n" + resp.toString() + "\n\nVEICOLI:\n" + s;
    }

}
