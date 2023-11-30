public class Distributore {
    /*Creare anche la classe Distributore che contiene più pompe di carburante. Ha come attributo il nome e l'indirizzo e il
vettore con le pompe di carburante. Realizzare i metodi;
• add(Carburante),
• i set/get opportuni e il toString()
• aumenta(tipo, percentuale) che aumenta il carburante di quel tipo della percentuale indicata
• getStatistiche() che stampa il prezzo min, max e il medio tra i carburanti del distributore.*/

    private Carburante [] vPompe;
    private final int MAX_POMPE;
    private final static int DEF_MAX_POMPE=10;
    private int nPompe=0;
    private String nome;
//<>

    public Distributore(String nome, int nMax){
        if(nMax>0){
            MAX_POMPE=nMax;
        }else{
            MAX_POMPE=DEF_MAX_POMPE;
        }
        this.nome=nome;
        vPompe=new Carburante[MAX_POMPE];
    }

    public void add(Carburante c){
        if(c!=null){
            if(nPompe<MAX_POMPE){
                vPompe[nPompe]=c;
                nPompe++;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        String s="il distributore " +getNome()+" ha "+ nPompe+" pompe";
        for(int k=0; k<nPompe; k++){
            s += " la "+k+ vPompe[k].toString();
        }
        return s;
    }
}
