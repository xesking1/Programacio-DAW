package Exercicis3;
import java.util.Scanner;
public class E1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0 ; i >= 0 ; i = sc.nextInt()) {
            suma += i;
            System.out.println("Introdueix un nombre:");
        }
        System.out.print("La suma de tots els nombres introduïts és: " + suma);
        sc.close();
    }
}
