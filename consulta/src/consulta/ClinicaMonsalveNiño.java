package consulta;

public final class ClinicaMonsalveNiño {

    String nombre;
    String numeroDocumento;
    int edad;
    String motivo;
    double telefono;
    String tipoPaciente;
    String estado;

    public ClinicaMonsalveNiño(String nombre, String numeroDocumento, int edad, String motivo, double telefono, String tipoPaciente, String estado) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.motivo = motivo;
        this.telefono = telefono;
        this.tipoPaciente = VerificarTipoPaciente();
        this.estado = estado;
    }

    
    String VerificarTipoPaciente() {
        if (edad < 18) {
            return tipoPaciente = "Menor de edad";
        } else {
            return tipoPaciente = "Mayor de edad";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;

    }

}
