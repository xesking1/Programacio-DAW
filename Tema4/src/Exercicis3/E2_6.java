package Exercicis3;
import java.util.Scanner;

public class E2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un nombre: ");
        int num = sc.nextInt();
        int factorial = num;
        for (int i = 1; i <= num ; i++) {
            System.out.println(factorial + "*" + i + " = " + factorial*i);
            factorial *= i;
        }

    }
}
