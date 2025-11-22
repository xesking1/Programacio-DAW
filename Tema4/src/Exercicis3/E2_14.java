package Exercicis3;
import java.util.Scanner;

public class E2_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base;
        int exp;
        for (int potencia = 0 ; potencia <= 10000 ;) {
            System.out.print("Introdueix la base de la potència: ");
            base = sc.nextInt();
            potencia = base;
            System.out.print("Introdueix l'exponent: ");
            exp = sc.nextInt();
            System.out.print(base + "^" + exp + " = ");
            while (exp > 1) {
                potencia *= base;
                exp--;
            }
            System.out.println(potencia);
            if (potencia <= 10000) { potencia=0; }
            else { System.out.print("La potència ha superat 10000. Fi del programa."); }
        }
    }
}
