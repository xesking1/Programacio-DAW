package Exercicis3;
import java.util.Scanner;
public class E1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int suma = 0;
        for (int nombre = sc.nextInt() ; nombre > 0 ; nombre /= 10) {
            suma += nombre%10;
        }
        System.out.print("La suma dels seus dígits és: " + suma);
        sc.close();
    }
}
