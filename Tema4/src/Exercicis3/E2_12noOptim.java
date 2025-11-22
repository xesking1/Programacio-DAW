package Exercicis3;
import java.util.Scanner;

public class E2_12noOptim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int perfecte;
        int div = 1;
        int suma = 0;
        do {
            System.out.print("Introdueix un nombre: ");
            perfecte = sc.nextInt();

            while (div<=(perfecte/2)) {
                if(perfecte%div==0){
                    System.out.println(div + " és divisor de " + perfecte + ". " + suma + " + " + div + " = " + (suma+div));
                    suma += div;
                }
                div++;
            }
            if(suma!=perfecte){ div = 1; suma = 0; }
            else { System.out.println("Nombre perfecte!"); }
        } while (suma!=perfecte);
    }
}
