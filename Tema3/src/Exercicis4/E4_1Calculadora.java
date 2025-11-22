package Exercicis4;
import java.util.Scanner;
public class E4_1Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //#1
        System.out.println("Introdueix un nombre: ");
        double nombre1 = sc.nextDouble();
        System.out.println("I un altre: ");
        double nombre2 = sc.nextDouble();

        System.out.println("Ara, sel·lecciona una de les opcions: \n-----------------------------------------\n+) Suma\n-) Resta\n*)Multiplicació\n/) Divisió\n%) Mòdul\n-----------------------------------------\nResposta: ");
        char operacio = sc.next().charAt(0);

        double resultat;
        switch (operacio) {
            case '+':
                resultat = nombre1 + nombre2;
                if (resultat > 100){
                    resultat *= 1.1;
                    System.out.println("10% afegit");
                } else if (resultat < 0){
                    System.out.println("Valor negatiu");
                }
                System.out.println(nombre1 + " + " + nombre2 + " + (bonificació) és: " + resultat);
                break;
            case '-':
                resultat = nombre1 - nombre2;
                System.out.println(nombre1 + " - " + nombre2 + " és: " + resultat);
                break;
            case '*':
                resultat = nombre1 * nombre2;
                if (resultat%2 == 0) {
                    resultat += 5;
                    System.out.println("5 afegit al resultat");
                } else {
                    resultat -= 5;
                    System.out.println("5 restat del resultat");
                }
                System.out.println(nombre1 + " * " + nombre2 + " +/- extra és: " + resultat);
                break;
            case '/':
                if (nombre2 == 0) {
                    System.out.println("Error: no es pot dividir per 0");
                    System.exit(1);
                }
                resultat = nombre1 / nombre2;
                if (resultat > 50) {
                    System.out.println("Valor alt");
                } else if (resultat < 0){
                    System.out.println("Valor negatiu");
                    System.exit(1);
                }
                System.out.println(nombre1 + " / " + nombre2 + " és: " + resultat);
                break;
            case '%':
                resultat = nombre1 % nombre2;
                if (resultat == 0) {
                    System.out.println("Exacte");
                } else if (resultat > 0) {
                    resultat *= 2;
                    System.out.println(nombre1 + " % " + nombre2 + " (" + (resultat/2) + ") és major que 0. Es multiplica per 2: " + resultat);
                }
                break;
            default:
                System.out.println("No has introduït un símbol vàlid.");
        }
        sc.close();
    }
}