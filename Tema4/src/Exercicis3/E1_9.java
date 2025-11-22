package Exercicis3;
import java.util.Scanner;
public class E1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int x = 0;
        for (int i = nombre ; i > 0 ; i--) {
            if (nombre%i == 0) {
                x++;
            }
        }
        if (x > 2) System.out.print("El nombre NO és primer");
        else System.out.print("El nombre és primer");
        sc.close();
    }
}
