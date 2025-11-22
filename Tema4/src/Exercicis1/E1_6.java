package Exercicis1;
import java.util.Scanner;
public class E1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        while (i >= 0) {
            suma += i;
            System.out.println("Introdueix un nombre:");
            i = sc.nextInt();
        }
        System.out.print("La suma de tots els nombres introduïts és: " + suma);
        sc.close();
    }
}
