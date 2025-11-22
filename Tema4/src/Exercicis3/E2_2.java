package Exercicis3;
import java.util.Scanner;

public class E2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un límit positiu: ");
        int limit = sc.nextInt();
        int num;
        for (int suma = 0 ; suma<=limit ;) {
            System.out.print("Introdueix un nombre: ");
            num = sc.nextInt();
            suma += num;
            System.out.println("Suma: " + suma);
            if (suma > limit) { System.out.print("S'ha superat el límit (" + limit + ")"); }
        }
    }
}
