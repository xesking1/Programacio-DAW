package Exercicis3;
import java.util.Scanner;
public class E1_5no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int i = 0;
        while (num != 0) {
            System.out.print("Introdueix un nombre: ");
            num = sc.nextInt();
            i++;
        }
        System.out.print("Enhorabona, has sortit del bucle!\nT'ha costat " + i + " intents");
        sc.close();
    }
}