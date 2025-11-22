package Exercicis3;
import java.util.Scanner;
public class E1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (String contrasenya = "" ; !contrasenya.equals("java123") ; contrasenya = sc.nextLine()) {
            System.out.print("Introdueix una contrasenya: ");
        }
        System.out.print("Benvingut!");
        sc.close();
    }
}
