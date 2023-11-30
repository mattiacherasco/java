public class Distributore {
    private String nome;
    private String indirizzo;
    private Carburante[] pompe;
    static int NUM_MAX = 100;

    private int num_pompe;

    public Distributore(String nome, String indirizzo) {
        nome = nome;
        indirizzo = indirizzo;
        pompe = new Carburante[NUM_MAX];
    }

    public void add(Carburante carburante) {
        if (carburante != null)
            if (num_pompe < NUM_MAX) {
                pompe[num_pompe] = carburante;
                num_pompe++;
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void aumenta(String tipo, float percentuale) {
        for (Carburante pompa : pompe) {
            if (pompa.getTipo() == tipo) {
                float prezzoAttuale = pompa.getPrezzo();
                float aumento = prezzoAttuale * (percentuale / 100);
                float nuovoPrezzo = prezzoAttuale + aumento;
                pompa.setPrezzo(nuovoPrezzo);
            }
        }
    }

    public String getStatistiche() {
        float prezzoMin = pompe[0].getPrezzo();
        float prezzoMax = pompe[0].getPrezzo();
        float somma = 0;
        float media;
        String str = "";
        for (int k = 1; k < num_pompe; k++) {
            if (pompe[k].getPrezzo() > prezzoMax)
                prezzoMax = pompe[k].getPrezzo();
            if (pompe[k].getPrezzo() < prezzoMin)
                prezzoMin = pompe[k].getPrezzo();
            somma += pompe[k].getPrezzo();
        }
        media = somma / num_pompe;
        str = "Prezzo minimo: " + prezzoMin + " Prezzo massimo: " + prezzoMax + " Media: " + media;
        return str;
    }

    public String toString() {
        String str = "";
        for (int k = 0; k < num_pompe; k++) {
            str += "Nome: " + nome + " Indirizzo: " + indirizzo + pompe[k].toString() + getStatistiche() + "\n";
        }
        return str;
    }
}