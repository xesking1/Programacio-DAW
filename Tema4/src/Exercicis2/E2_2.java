package Exercicis2;
import java.util.Scanner;

public class E2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un límit positiu: ");
        int limit = sc.nextInt();
        int num;
        int suma = 0;
        do {
            System.out.print("Introdueix un nombre: ");
            num = sc.nextInt();
            suma += num;
            System.out.println("Suma: " + suma);
        } while (suma<=limit);
    }
}
