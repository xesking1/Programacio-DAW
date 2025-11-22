package Exercicis3;
import java.util.Scanner;
public class E1_18no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu una frase: ");
        String frase = sc.nextLine();
        int i = frase.length()-1; // caràcter final de la frase
        int x = 0; // caràcter inicial
        while (frase.charAt(x)==' ' && x < i) { // revisa que no hi hagi espais al principi
            x++;
        }
        if (x>i) { // si x ha passat i (final), és que només ha detectat espais. no hi ha cap paraula
            System.out.println("La frase no té paraules");
            return;
        }
        while (frase.charAt(i)==' ' && i > 0) { // revisa que no hi hagi espais al final
            i--;
        }
        int paraules = 1;
        while(i>=0 && i >= x) { // x s'ha quedat a l'inici real de la frase. i s'atura allà
            if(frase.charAt(i)==' ') {
                while(frase.charAt(i-1)==' ') { // detecta si hi ha espais repetits i els bota
                    i--;
                }
                paraules++;
            }
            i--;
        }
        String singPlur = (paraules==1) ? " paraula" : " paraules";
        System.out.println("La frase té " + paraules + singPlur);
        sc.close();
    }
}
