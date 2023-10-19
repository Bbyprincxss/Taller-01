package Program.Model;

public class Personal {

    /**
     * Atributos
     */
    private String nombre;
    private int edad;
    private String contrato;
    private int fechaContratacion;
    private int fechaTermino; //solo para contarto plazo fijo

    /**
     * Constructor
     * @param nombre nombre personal
     * @param edad edad personal
     * @param contrato tipo de contrato del personal
     * @param fechaContratacion fecha de la contratacion
     * @param fechaTermino fecha de termino de la contratacion
     */
    public Personal(String nombre, int edad, String contrato, int fechaContratacion, int fechaTermino) {
        this.nombre = nombre;
        this.edad = edad;
        this.contrato = contrato;
        this.fechaContratacion = fechaContratacion;
        this.fechaTermino = fechaTermino;
    }


    /**
     * Metodo que devuelve el nombre del personal
     * @return nombre del personal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que devuelve edad del personal
     * @return edad del personal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que devuelve el contrato del personal
     * @return contrato del personal
     */
    public String getContrato() {
        return contrato;
    }


    /**
     * Metodo que devuelve fecha de termino
     * @param fechaTermino del contrato del personal
     */
    public void setFechaTermino(int fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}




