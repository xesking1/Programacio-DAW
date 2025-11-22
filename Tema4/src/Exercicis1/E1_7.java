package Exercicis1;
import java.util.Scanner;
public class E1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenya = "";
        while (!contrasenya.equals("java123")) {
            System.out.print("Introdueix una contrasenya: ");
            contrasenya = sc.nextLine();
        }
        System.out.print("Benvingut!");
        sc.close();
    }
}
