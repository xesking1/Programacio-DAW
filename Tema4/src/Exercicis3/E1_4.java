package Exercicis3;
import java.util.Scanner;
public class E1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i+=2) {
            System.out.println(i);
        }
        sc.close();
    }
}
