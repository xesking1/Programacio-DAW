package Exercicis3;
import java.util.Scanner;
public class E1_8no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int nombre1 = nombre;
        int i = 0;
        while (nombre1 != 0) {
            nombre1 /= 10;
            i++;
        }
        System.out.print(nombre + " té " + i + " dígits");
        sc.close();
    }
}
