package Exercicis3;
import java.util.Scanner;
public class E1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu una frase: ");
        String frase = sc.nextLine();

        int a = 0;
        for (int i = 0 ; i<frase.length() ; i++){
            if(frase.charAt(i)=='a'){
                a++;
            }
        }
        System.out.println("\"a\" apareix " + a + " pics");
        sc.close();
    }
}
