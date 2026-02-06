
package MODELO;

public class Camper extends Persona{
    private String curso, materia;

    public Camper(String curso, String materia, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.curso = curso;
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    

}
