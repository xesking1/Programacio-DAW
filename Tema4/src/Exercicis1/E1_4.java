package Exercicis1;
import java.util.Scanner;
public class E1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre: ");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i += 2;
        }
        sc.close();
    }
}
