package Exercicis2;
import java.util.Scanner;

public class E2_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int RANDOM = (int)(Math.random()*100)+1;
        int num;
        int intents = 10;
        do {
            System.out.println("Intenta endevinar el nombre secret entre 1 i 100 (" + RANDOM + "): ");
            num = sc.nextInt();
            if (num == RANDOM) { System.out.println("Enhorabona!"); break; }
            else if (num < 1 || num > 100) { System.out.println("Fora del rang."); }
            intents--;
            System.out.println("Intents: " + intents);
        } while(intents>0);
    }
}
