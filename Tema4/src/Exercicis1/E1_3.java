package Exercicis1;
import java.util.Scanner;
public class E1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre positiu: ");
        int num = sc.nextInt();
        int i = 1;
        int suma = 0;
        while (i<=num) {
            suma += i;
            System.out.println(suma-i + " + " + i + " = " + suma);
            i++;
        }
        System.out.print("Fin.");
        sc.close();
    }
}
