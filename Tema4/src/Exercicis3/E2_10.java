package Exercicis3;
import java.util.Scanner;

public class E2_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int RANDOM = (int)(Math.random()*100)+1;
        int num;
        for (int intents = 10 ; intents>0 ;) {
            System.out.print("Intenta endevinar el nombre secret entre 1 i 100 (" + RANDOM + "): ");
            num = sc.nextInt();
            if (num == RANDOM) { System.out.println("Enhorabona!"); break; }
            else {
                if (num < 1 || num > 100) { System.out.println("Fora del rang."); }
                else {
                    if (num > RANDOM) {
                        System.out.println("Has fallat. Més abaix.");
                    } else {
                        System.out.println("Has fallat. Més amunt.");
                    }
                    intents--;
                }
            }
            System.out.println("Intents: " + intents);
        }
        System.out.println("Fi del joc.");
    }
}
