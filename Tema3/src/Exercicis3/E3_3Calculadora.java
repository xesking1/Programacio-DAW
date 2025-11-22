package Exercicis3;
import java.util.Scanner;
public class E3_3Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        double n1=sc.nextDouble();
        System.out.println("Un altre: ");
        double n2=sc.nextDouble();
        System.out.println("Ara, sel·lecciona una de les opcions: \n-----------------------------------------\n+) Suma\n-) Resta\n*)Multiplicació\n/) Divisió\n%) Mòdul\n-----------------------------------------\nResposta: ");
        char operacio = sc.next().charAt(0);

        double resultat;
        if (operacio == '+') {
            resultat = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + resultat);
        } else if (operacio == '-') {
            resultat = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resultat);
        } else if (operacio == '*') {
            resultat = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + resultat);
        } else if (operacio == '/') {
            resultat = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + resultat);
        } else if (operacio == '%') {
            resultat = n1 % n2;
            System.out.println(n1 + " % " + n2 + " = " + resultat);
        } else {
            System.out.println("Operació no vàlida");
        }
    }
}
