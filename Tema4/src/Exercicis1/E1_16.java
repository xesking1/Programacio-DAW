package Exercicis1;
import java.util.Scanner;

public class E1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int a = sc.nextInt();
        int modul = a;
        System.out.print("Introdueix un altre: ");
        int b = sc.nextInt();
        int resultat = 0;
        while (modul >= b) {
            modul -= b;
            resultat++;
        }
        System.out.println(a + " / " + b + " = " + resultat + "\n" + a + " % " + b + " = " + modul);
        sc.close();
    }
}
