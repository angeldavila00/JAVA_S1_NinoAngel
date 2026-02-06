
package MODELO;

public class Profesor extends Persona{
    private String materia;
    private double salario;

    public Profesor(String materia, double salario, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
    
            
    
    
}
