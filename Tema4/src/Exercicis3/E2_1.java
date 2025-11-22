package Exercicis3;
import java.util.Scanner;
public class E2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String paraula = "";
        int i = 0;
        int f = 0;
        for (boolean palindrom = false; !palindrom ;) {
            System.out.print("Introdueix una paraula: ");
            paraula = sc.next();
            sc.nextLine();
            i = 0;
            f = paraula.length()-1;
            while (i<=f) {
                if (paraula.charAt(i) != paraula.charAt(f)) {
                    System.out.println("No és una paraula palíndrom");
                    break;
                }
                i++;
                f--;
                if (i >= f) {palindrom = true;}
            }
        }
        System.out.print("És una paraula palíndrom");
    }
}
