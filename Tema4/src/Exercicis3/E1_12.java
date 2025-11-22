package Exercicis3;
import java.util.Scanner;
public class E1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int taula = nombre;
        for (int i = 10 ; i > 0 ; i--) {
            taula *= i;
            System.out.println(nombre + "*" + i + " = " + taula);
            taula = nombre;
        }
        sc.close();
    }
}
