package Program.Model;

public class Personal {
    private String nombre;
    private int edad;
    private String tipoContrato;
    private int fechaContratacion;

    public Personal(String nombre, int edad, String tipoContrato, int fechaContratacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(int fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}




