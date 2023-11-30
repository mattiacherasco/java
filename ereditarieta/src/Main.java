/*

Si scriva una classe Persona dotata dei campi CodiceFiscale, Nome, Cognome e dei metodi per
impostare e leggere tali valori. La classe inoltre dovrà essere dotata del metodo toString(). Si
definisca poi una classe Studente come estensione di Persona; i campi aggiuntivi di Studente
rispetto a Persona sono matricola e università. Inoltre la classe Studente dovrà avere i metodi per
impostare e leggere tali campi e dovrà sovrascrivere il metodo toString(). Si definisca infine la
classe Docente che estende Persona con campi aggiuntivi materia e salario. Anche in questo caso la
classe dovrà avere metodi per leggere e impostare i vari attributi e dovrà sovrascrivere il metodo
toString().

Si scriva la classe ElencoPersone le cui istanze rappresentano elenchi di persone. La classe avrà i
seguenti metodi:
• un costruttore per creare una lista specificando il numero massimo di persone che è possibile
inserire nell'elenco;
• un metodo aggiungi(Persona p) che aggiunge p all'elenco;
• un metodo toString() che stampa la lista delle persone nell'elenco. Si scriva poi una classe
ProvaListaPersone con il solo metodo main che crea una lista di persone la cui dimensione è scelta
dall'utente; si simula la richiesta l’inserimento ripetuto, a sua scelta, una Persona, uno Studente o un
Docente, chiedendo i dati opportuni; infine stampa la lista delle persone inserite.

 */

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Mattia", "Cherasco");
        Studente studente1 = new Studente("Manuel", "Cherasco", "matricola", "torino");
        Docente docente1 = new Docente("Giada", "Cherasco");

        ElencoPersone elenco1 = new ElencoPersone(10);

        elenco1.add(persona1);
        elenco1.add(studente1);
        elenco1.add(docente1);

        System.out.println(elenco1.toString());



    }
}