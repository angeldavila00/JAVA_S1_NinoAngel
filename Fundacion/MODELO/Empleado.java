
package MODELO;

public class Empleado extends Persona{
    private String cargo;
    private double salario;
    private String horario;

    public Empleado(String cargo, double salario, String horario, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    public void Presentarse(){
        System.out.println("Soy Empleado, mi nombre es "+getNombre()+ " "+getApellido()+", me desempeño como "+getCargo());
        
    }

    
    

}
