package Exercicis1;
import java.util.Scanner;
public class E1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu una frase: ");
        String frase = sc.nextLine();
        int i = frase.length()-1;
        int a = 0;
        while(i>=0){
            if(frase.charAt(i)=='a'){
                a++;
            }
            i--;
        }
        System.out.println("\"a\" apareix " + a + " pics");
        sc.close();
    }
}
