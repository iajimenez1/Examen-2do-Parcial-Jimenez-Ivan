package Dominio;

public class PorDiscapacidad extends Pension {

    private int pdiscapacidad;
    private int at;

    public PorDiscapacidad(int pdiscapacidad, int at, int sueldo, String nombre, String cedula) {
        super(sueldo, nombre, cedula);
        this.pdiscapacidad = pdiscapacidad;
        this.at = at;
    }

    public int getPdiscapacidad() {
        return pdiscapacidad;
    }

    public void setPdiscapacidad(int pdiscapacidad) {
        this.pdiscapacidad = pdiscapacidad;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public String sueldo() {
        return "\nPension por discapacidad\n" + "\nNombre:\n" + super.getNombre() + "\nNumero de cedula:\n" + super.getCedula()
                + "Porcentaje de discapacidad:\n" + this.pdiscapacidad + "\nPension a recibir:";
    }

}
