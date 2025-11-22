package Exercicis3;
import java.util.Scanner;

public class E2_9no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        final int BASE = sc.nextInt();
        int num;
        int i = 0;
        do {
            System.out.print("Introdueix més nombres: ");
            num = sc.nextInt();
            i++;
        } while (num%BASE!=0);
        System.out.println(num + " és múltiple de " + BASE + ". Fi del programa.");
    }
}
