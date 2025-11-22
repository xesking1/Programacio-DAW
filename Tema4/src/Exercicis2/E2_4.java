package Exercicis2;
import java.util.Scanner;

public class E2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String contrasenya;
        boolean valida = false;
        boolean majuscula = false;
        boolean digit = false;
        int i = 0;
        do {
            System.out.print("Introdueix la contrasenya: ");
            contrasenya = sc.nextLine();
            while (i < contrasenya.length()) {
                if (Character.isUpperCase(contrasenya.charAt(i))){majuscula=true;}
                i++;
            }
        } while (contrasenya.length() < 8 && majuscula && digit);
    }
}
