
package MODELO;

public class Empleado extends Persona{
    private double salario;
    private String horario;

    public Empleado(double salario,String horario,String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
    }
    
      @Override
    public void Presentarse(){
        System.out.println("Soy Empleado, mi nombre es "+getNombre()+ " "+getApellido());
        
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
    }

   
    
    


    
    
  

    
    


