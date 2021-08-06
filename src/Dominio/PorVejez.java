package Dominio;

public class PorVejez extends Pension {

    private int at;

    public PorVejez(int at, int sueldo, String nombre, String cedula) {
        super(sueldo, nombre, cedula);
        this.at = at;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public String sueldo() {
        return "\nPension por vejez\n" + "\nNombre:\n" + super.getNombre() + "\nNumero de cedula:\n" + super.getCedula() + "\nPension a recibir:";
    }

}
