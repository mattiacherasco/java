public class Dado {

    static int NUM_FACCE;

    final static int FACCE_DEFAULT=6;

    private int num_uscito;

    public Dado(){
        NUM_FACCE=FACCE_DEFAULT;
    }

    public Dado(int num_facce){
        NUM_FACCE=num_facce;
    }

    public void lanciaDado(){
        this.num_uscito=(int)(Math.random()*(NUM_FACCE)+1);
    }


    public int getLancio(){
        return this.num_uscito;
    }

}
