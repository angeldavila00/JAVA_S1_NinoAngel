
package MODELO;

public class Empleado extends Persona{
    private double salario;
    private String horario;

    public Empleado(double salario, String horario, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.salario = salario;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    @Override
    public String getTipo() {
        return "Empleado";
    }
    
    
      @Override
    public void Presentarse(){
        System.out.println("Hola, mi nombre es "+getNombre()+ " "+getApellido());
        
    }


    }
