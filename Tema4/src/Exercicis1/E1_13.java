package Exercicis1;
import java.util.Scanner;
public class E1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();
        int suma = nombre;
        while (nombre != 0) {
            System.out.print("Segueix: ");
            nombre = sc.nextInt();
            suma += nombre;
        }
        System.out.println("S'ha acabat!\nLa suma de tots els nombres és: " + suma);
        sc.close();
    }
}
