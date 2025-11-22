package Exercicis1;
import java.util.Scanner;
public class E1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int i = nombre;
        int x = 0;
        while (i > 0) {
            if (nombre%i == 0) {
                x++;
            }
            i--;
            if (x > 2) {
                System.out.print("El nombre NO és primer");
                break;
            }
        }
        System.out.print("El nombre és primer");
        sc.close();
    }
}
