package Exercicis5;
import java.util.Scanner;
public class E3_4Rols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el teu rol com a usuari: ");
        if (!sc.hasNextLine()) {
            System.out.println("Error: usuari invàlid");
            System.exit(1);
        }
        String rol = sc.nextLine();
        System.out.println("Introdueix la teva contrasenya: ");
        if (!sc.hasNextLine()) {
            System.out.println("Error: contrasenya invàlida");
            System.exit(1);
        }
        String contrasenya = sc.nextLine();

        if (rol.equals("admin") && contrasenya.equals("1234")) {
            System.out.println("Accés total");
        } else if (rol.equals("editor") && contrasenya.equals("abcd")) {
            System.out.println("Accés limitat");
        } else if (rol.equals("visitant")) {
            System.out.println("Accés de lectura");
        } else {
            System.out.println("Accés denegat");
        }


    }
}
