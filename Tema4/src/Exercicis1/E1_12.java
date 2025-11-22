package Exercicis1;
import java.util.Scanner;
public class E1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int taula = nombre;
        int i = 10;
        while (i > 0) {
            taula *= i;
            System.out.println(nombre + "*" + i + " = " + taula);
            taula = nombre;
            i--;;
        }
        sc.close();
    }
}
