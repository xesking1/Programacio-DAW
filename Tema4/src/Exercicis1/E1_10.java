package Exercicis1;
import java.util.Scanner;
public class E1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int nombreTemp = nombre;
        int invers = 0;
        int i = 0;
        while (nombreTemp > 1) {
            nombreTemp /= 10;
            i++;
        }
        int modul = (int)Math.pow(10, i);
        while (i >= 0) {
            invers += (nombre % 10)*modul;
            nombre/=10;
            modul/=10;
            i--;
        }
        System.out.print("L'invers és: " + invers);
        sc.close();
    }
}
