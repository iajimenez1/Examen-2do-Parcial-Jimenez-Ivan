package Dominio;

public class Patronal extends Pension {

    private int at;
    private String empresa;

    public Patronal(int at, String empresa, int sueldo, String nombre, String cedula) {
        super(sueldo, nombre, cedula);
        this.at = at;
        this.empresa = empresa;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String sueldo() {
        return "\nPension patronal\n" + "\nNombre:\n" + super.getNombre() + "\nNumero de cedula:\n" + super.getCedula()
                + "\nTipo de empresa:\n" + this.empresa + "\nPension a recibir:";
    }

}
