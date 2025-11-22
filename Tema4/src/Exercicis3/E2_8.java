package Exercicis3;
import java.util.Scanner;

public class E2_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;
        for (String fi = "" ; !fi.equals("fi") ;) {
            System.out.print("Introdueix un nombre: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sc.nextLine();
                if (max == 0 && min == 0) max = min = num;
                if (num>max) max = num;
                else if (num<min) min = num;
                System.out.println("Valor màxim: " + max + "\nValor mínim: " + min);
            } else {
                fi = sc.nextLine();
                if (fi.equalsIgnoreCase("fi")) {
                    System.out.println("Programa finalitzat.");
                    break;
                } else {
                    System.out.println("Introdueix un valor vàlid.");
                }
            }
        }
    }
}
