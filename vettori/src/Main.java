public class Main {
    public static void main(String[] args) {
        int [] vet = new int[5]; //che sintassi brutta
        int somma=0;
        for (int k=0; k<vet.length;k++){
            vet[k]++;
            System.out.println(vet[k]+" ");
        }
        for (int el : vet){
            el++;
            System.out.println(el+" ");
            somma=somma+el;
        }
        System.out.println("somma= " + somma);
        int min=10;
        int max=100;
        int [] vet2 = new int[20];
        for (int j=0;j< vet2.length;j++){
            boolean duplicato;
            do {
                vet2[j]=(int) (Math.random() * (max - min + 1) + min);
                duplicato=false;
                int i =0;
                while(i<j && duplicato==false){
                    if (vet2[j] == vet2[i]) {
                        duplicato = true;
                    }
                    i++;
                }
            }while (duplicato) ;
        }
        for (int el : vet2){
            System.out.print(el + " ");
        }


    }
}