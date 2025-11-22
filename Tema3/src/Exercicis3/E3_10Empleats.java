package Exercicis3;
import java.util.Scanner;
public class E3_10Empleats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el sou base: ");
        double souBase = sc.nextDouble();
        System.out.println("Ara, tres puntuacions (0-100) segons: ");
        System.out.println("Productivitat: ");
        int productivitat = sc.nextInt();
        System.out.println("Assistència: ");
        int assistencia = sc.nextInt();
        System.out.println("Compliment d'objectius: ");
        int objectius = sc.nextInt();

        double souFinal = souBase;
        double notaFinal = (double)(productivitat+assistencia+objectius)/3;
        System.out.println("Nota final: " + notaFinal);
        if (notaFinal >= 90) {
            System.out.println("Excel·lent, bonificació del 20% al sou");
            souFinal = souBase*1.2;
        } else if (notaFinal >= 70) {
            System.out.println("Bo, bonificació del 10% al sou");
            souFinal = souBase*1.1;
        } else if (notaFinal >= 50) {
            System.out.println("Acceptable");
        } else {
            System.out.println("Insuficient, penalització de 50% al sou");
            souFinal = souBase*0.95;
        }
        System.out.println("Sou final: " + souFinal + "$");
    }
}
