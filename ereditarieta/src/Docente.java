public class Docente extends Persona{

    private String materia;
    private String salario;

    public Docente(String nome, String cognome){
        super(nome, cognome);
        this.materia=materia;
        this.salario=salario;
    }

    @Override
    public String toString() {
        return "materia: "+materia+" salario: "+salario;
    }

}
