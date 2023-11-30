public class Mostro {
    private String nome;
    private int vita;
    private int forza;

    private int facce;

    private static final int MIN_VITA = 0;          //final=costante    static=per ogni mostro
    private static final int MAX_VITA = 100;
    private static final int MIN_FORZA = 5;
    private static final int MAX_FORZA = 10;
    private final int FACCE;
    private static final int DEFAULT_FACCE=6;

    public Mostro(String nome, int forza, int vita, int facce){
    this.nome = nome;
    FACCE = (facce>= DEFAULT_FACCE)? facce: DEFAULT_FACCE;
    if(forza >= MIN_FORZA && forza <= MAX_FORZA)
        this.forza = forza;
    else
        this.forza = MAX_FORZA/2;
    if(vita >= MIN_VITA && vita <= MAX_VITA)
        this.vita = vita;
    else
        this.vita=MAX_VITA/2;
    }

    public Mostro(String nome){
        this.nome = nome;
        this.vita=(int)(Math.random()*(MAX_VITA - MIN_VITA +1))+MIN_VITA; //formula per generare un casuale
        this.forza=(int)(Math.random()*(MAX_FORZA - MIN_FORZA +1))+MIN_FORZA;
        FACCE = 0;
    }

    public String toString() {
    return nome + ": forza = "+ forza + ", vita = " + vita;
    }

    public int getVita(){
        return vita;
    }

    public int getForza(){
        return forza;
    }

    public String getNome(){
        return nome;
    }

    public void setVita(int vita){
        if(vita >= MIN_VITA && vita <= MAX_VITA)
            this.vita=vita;
        else if (vita < MIN_VITA)
            this.vita=MIN_VITA;
        else if (vita > MAX_FORZA)
            this.vita=MAX_FORZA;
    }

    public void setForza(int forza){
        if(forza >= MIN_FORZA && forza <= MAX_FORZA)
            this.forza=forza;
    }

    private int getLancio(){
        return (int)(Math.random()* DEFAULT_FACCE)+ 1;
    }

    public void attaccatoDa(Mostro m){
        int dado = getLancio();

        setVita(vita - dado * m.getForza());
    }

    public void gioca(Mostro m){
        while(vita > 0 && m.getVita() >0){
            attaccatoDa(m);
            System.out.println(this);
            if(vita>0){
                m.attaccatoDa(this);
                System.out.println(m);
            }
        }
        System.out.print("ha vinto ");
        if(vita==0)
            System.out.println(m.getNome());
        else
            System.out.println(nome);
    }





}