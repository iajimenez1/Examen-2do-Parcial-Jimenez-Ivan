package Dominio;

public abstract class Pension {

    private int sueldo;
    private String nombre;
    private String cedula;

    public Pension(int sueldo, String nombre, String cedula) {
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public abstract String sueldo();

}
