public class ElencoPersone {
    private Persona [] elenco;
    private int cont;

    private final int NPERSONE;


    public ElencoPersone(int maxPersone){
        cont=0;
        NPERSONE=maxPersone;
        //controllo
        elenco=new Persona[NPERSONE];
    }

    public void add(Persona p){
        if(p!=null && cont<NPERSONE){
            elenco[cont]=p;
            cont++;
        }
    }

    public String toString(){
        String s="";
        for(int k=0; k<cont; k++){
            s = s+elenco[k].toString()+"\n";
        }
        return s;
    }

}
