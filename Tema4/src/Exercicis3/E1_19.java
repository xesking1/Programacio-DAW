package Exercicis3;
import java.util.Scanner;

public class E1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriu una frase : ");
        String frase = sc.nextLine();
        int f = frase.length()-1;
        int a = 0;
        for (int i = 0 ; i<=f ; i++){
            if(i!=f){
                if(frase.charAt(i)=='a'){a++;}
                if(frase.charAt(f)=='a'){a++;}
            } else {if(frase.charAt(i)=='a'){a++;}}
            System.out.println(frase.charAt(i) + " " + frase.charAt(f));
            f--;
        }
        sc.close();
    }
}
