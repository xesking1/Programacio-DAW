package Exercicis3;
import java.util.Scanner;

public class E2_4no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String contrasenya;
        boolean majuscula;
        boolean digit;
        int i = 0;
        do {
            System.out.print("Introdueix la contrasenya: ");
            contrasenya = sc.nextLine();
            majuscula = false;
            digit = false;
            while (i < contrasenya.length()) {
                if (Character.isUpperCase(contrasenya.charAt(i))) { majuscula=true; }
                if (contrasenya.charAt(i) > '0' && contrasenya.charAt(i) < '9') { digit=true; }
                i++;
            }
            if (contrasenya.length() < 8) { System.out.println("La llargària mínima és de 8"); }
            if (!majuscula) { System.out.println("Ha de contenir almenys 1 majúscula."); }
            if (!digit) { System.out.println("No conté nombres. Ha de contenir almenys 1."); }
        } while (contrasenya.length() < 8 || !majuscula || !digit);
        System.out.print("Contrasenya vàlida.");
    }
}
