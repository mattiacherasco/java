public class Concessionaria {

    private String nome;
    private int maxAuto;
    private Auto[] vAuto;
    private int nAuto;
    private final int MAX_AUTO;
    private final static int DEF_MAX_AUTO=10;

    public Concessionaria(String nome, int maxAuto){
        if(maxAuto>0){
            MAX_AUTO=maxAuto;
        }else{
            MAX_AUTO=DEF_MAX_AUTO;
        }
        this.nome=nome;
        vAuto=new Auto[MAX_AUTO];
    }

    public void add(Auto a){
        if(a!=null){
            if(nAuto<MAX_AUTO){
                vAuto[nAuto]=a;
                nAuto++;
            }
        }
    }

    public float getValoreTot(){
        float sommmaPrezzi=0;
        for(int k=0; k<nAuto; k++){
            sommmaPrezzi+=vAuto[k].getPrezzo();
        }
        return sommmaPrezzi/nAuto;
    }

    public String vediColore(String modello){
        String s="del modello "+modello+" ci sono macchine";
        for (int k=0; k<nAuto; k++){
            if(vAuto[k].getModello().equals(modello))
                s += vAuto[k].getColore()+"\n";
        }
        return s;
    }

    public String toString(){
        String s="concessionaria: "+nome+" di valore: "+getValoreTot();
        for (int k=0; k<nAuto; k++){
            s+=vAuto[k].toString();
        }
        return s;
    }

}
