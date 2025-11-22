package Exercicis3;
import java.util.Scanner;
public class E1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int nombre = sc.nextInt();

        int suma = 0;
        for (int i = 0 ; i < nombre ; i++){
            if (i%3==0){
                suma += i;
            }
        }
        System.out.println("La suma dels múltiples de 3 abans de " + nombre + " és: " + suma);
        sc.close();
    }
}
