package Exercicis5;
import java.util.Scanner;
public class E3_2Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una longitud fer formar un triangle: ");
        if (sc.hasNextInt()) {
            double a = sc.nextDouble();
            System.out.println("Una altra: ");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();
                System.out.println("I una més: ");
                if (sc.hasNextDouble()) {
                    double c = sc.nextDouble();

                    if (a + b > c && a + c > b && b + c > a) {
                        if (a == b && b == c) {
                            System.out.println("El triangle és equilàter");
                        } else if (a == b || a == c || b == c) {
                            System.out.println("El triangle és isòsceles");
                        } else {
                            System.out.println("El triangle és escalè");
                        }
                    } else {
                        System.out.println("Aquestes tres longituds no poden formar un triangle");
                    }
                } else {
                    System.out.println("Valor erroni");
                }
            } else {
                System.out.println("Valor erroni");
            }
        } else {
            System.out.println("Valor erroni");
        }
    }
}
