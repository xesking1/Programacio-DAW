package Exercicis2;
import java.util.Scanner;

public class E2_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        int i = 0;
        int vocals = 0;
        int consonants = 0;
        char ch;
        do {
            System.out.print("Introdueix una frase: ");
            frase = sc.nextLine();
            while (i<frase.length()) {
                ch = frase.charAt(i);
                if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u') {
                        vocals++;
                    } else {
                        consonants++;
                    }
                }
                i++;
            }
            System.out.println("Vocals: " + vocals + "\nConsonants: " + consonants);
            if (vocals<10) {
                vocals = 0;
                consonants = 0;
            }
        } while (vocals<10);
        System.out.print("Has aconseguit sortir del bucle! La frase té 10 vocals o més.");
    }
}
