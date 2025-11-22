package Exercicis3;
import java.util.Scanner;

public class E2_7SiNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        int vocals;
        int consonants;
        char ch;
        do {
            System.out.print("Introdueix una frase: ");
            frase = sc.nextLine();
            vocals = 0;
            consonants = 0;
            for (int i = 0 ; i<frase.length() ; i++) {
                ch = frase.toLowerCase().charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".indexOf(ch) != -1) {
                        vocals++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println("Vocals: " + vocals + "\nConsonants: " + consonants);
        } while (vocals<10);
        System.out.print("Has aconseguit sortir del bucle! La frase té 10 vocals o més.");
    }
}
