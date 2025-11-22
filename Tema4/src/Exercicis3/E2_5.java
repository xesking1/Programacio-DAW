package Exercicis3;
import java.util.Scanner;

public class E2_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num;
        double den;
        double suma = 0;
        System.out.println("Introdueix FI a qualsevol de les preguntes per acabar el programa.");
        for (boolean fi = false ; !fi ;) {
            System.out.print("Introdueix un numerador: ");
            if (!sc.hasNextDouble()) {
                if (sc.next().equalsIgnoreCase("FI")) { fi = true; }
                else { System.out.println("Valor invàlid. Torna a començar.\n"); continue; }
            }  else {
                num = sc.nextDouble();
                System.out.print("Introdueix un denominador: ");
                if (!sc.hasNextDouble()) {
                    if (sc.next().equalsIgnoreCase("FI")) { fi = true; }
                    else { System.out.println("Valor invàlid. Torna a començar.\n"); continue; }
                }  else {
                    den = sc.nextDouble();
                    suma += num/den;
                }
            }
            System.out.println("Suma: " + suma);
            if (fi) { System.out.print("Ha acabat el programa."); }
        }
    }
}
