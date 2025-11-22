package Exercicis1;
import java.util.Scanner;
public class E1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int suma = 0;
        while (nombre > 0) {
            suma += nombre%10;
            nombre /= 10;
        }
        System.out.print("La suma dels seus dígits és: " + suma);
        sc.close();
    }
}
