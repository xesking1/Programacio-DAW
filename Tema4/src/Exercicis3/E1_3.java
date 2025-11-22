package Exercicis3;
import java.util.Scanner;
public class E1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre positiu: ");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i<=num ; i++) {
            suma += i;
            System.out.println(suma-i + " + " + i + " = " + suma);
        }
        System.out.print("Fin.");
        sc.close();
    }
}
