public class Pinacoteca {

    private String nome;
    private final int MAXQUADRI;
    private final static int DEF_MAXQUADRI=10;
    private Quadro[] vQuadri;
    private int nQuadri=0;

    public Pinacoteca(String nome, int maxQuadri){
        this.nome=nome;
        if(maxQuadri>0){
            MAXQUADRI=maxQuadri;
        }else{
            MAXQUADRI=DEF_MAXQUADRI;
        }
        vQuadri=new Quadro[MAXQUADRI];
    }

    public void add(Quadro q){
        if(q!=null){
            if(nQuadri<MAXQUADRI) {
                vQuadri[nQuadri] = q;
                nQuadri++;
            }
        }
    }

    public void setPrezzo(String titolo, int aumento){
        for(int k=0; k<nQuadri; k++){
            if(vQuadri[k].getTitolo().equals(titolo)){
                vQuadri[k].setValore(vQuadri[k].getValore()+aumento);
            }
        }
    }

    public float getValoreMedio(){
        float valoreTot=0;
        for(int k=0; k<nQuadri; k++){
            valoreTot +=vQuadri[k].getValore();
        }
        return valoreTot/nQuadri;
    }

    public String toString(){
        String s="il valore medio è "+getValoreMedio();
        for(int k=0; k<nQuadri; k++){
            s+=vQuadri[k].toString()+"ciao \n";
        }
        return s;
    }
}
