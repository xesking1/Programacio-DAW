package Exercicis2;
import java.util.Scanner;
public class E2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String paraula = "";
        int i = 0;
        int f = 0;
        boolean palindrom = false;
        boolean comprovacio = true;
        do {
            System.out.print("Introdueix una paraula: ");
            paraula = sc.next();
            i = 0;
            f = paraula.length()-1;
            while (i<=f && comprovacio) {
                if (paraula.charAt(i) != paraula.charAt(f)) {
                    comprovacio=false;
                    System.out.println("No és una paraula palíndrome");
                }
                i++;
                f--;
                if (i >= f) {palindrom = true;}
            }
            comprovacio = true;
        } while (!palindrom);
        System.out.print("És una paraula palíndrome");
    }
}
