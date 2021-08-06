package Test;

import Dominio.Patronal;
import Dominio.PorDiscapacidad;
import Dominio.PorVejez;
import java.util.Scanner;

public class Ejecuta {

    public static void main(String[] args) {
        Patronal p;
        Scanner e = new Scanner(System.in);
        int j = 0, at, pe, sueldo, pdis;
        String n, id, emp;

        do {
            System.out.println("Ingres el tipo de jubilacion:(1=Vejez, 2=Discapacidad, 3=Patronal,4=salir)");
            j = e.nextInt();
            if (j == 1) {
                e.nextLine();
                System.out.println("Ingrese el nombre:");
                n = e.nextLine();
                System.out.println("Ingrese ID o cedula:");
                id = e.nextLine();
                System.out.println("Ingrese el sueldo:");
                sueldo = e.nextInt();
                System.out.println("Ingrese el numeor de años trabjados:");
                at = e.nextInt();
                p = new PorVejez(at, sueldo, n, id);
            }
            if (j == 2) {
                System.out.println("Ingrese el nombre:");
                n = e.nextLine();
                System.out.println("Ingrese ID o cedula:");
                id = e.nextLine();
                System.out.println("Ingrese el sueldo:");
                sueldo = e.nextInt();
                System.out.println("Ingrese el porcentaje de discapacidad:");
                pdis = e.nextInt();
                System.out.println("Ingrese el numeor de años trabjados:");
                at = e.nextInt();
                p = new PorDiscapacidad(pdis, at, sueldo, n, id);

            }
            if (j == 3) {
                System.out.println("Ingrese el nombre:");
                n = e.nextLine();
                System.out.println("Ingrese ID o cedula:");
                id = e.nextLine();
                System.out.println("Ingrese si es empresa publica o privada");
                emp = e.nextLine();
                System.out.println("Ingrese el sueldo:");
                sueldo = e.nextInt();
                System.out.println("Ingrese el numeor de años trabjados:");
                at = e.nextInt();
                p = new Patronal(at, emp, sueldo, n, id);

            }
        } while (j != 4);
    }

}
