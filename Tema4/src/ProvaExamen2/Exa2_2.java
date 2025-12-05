package ProvaExamen2;
import java.util.Scanner;

public class Exa2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un nombre entre 0 i 9: ");
        int n = sc.nextInt();
        if (n < 0 || n > 9) {
            System.out.println("Nombre fora del rang.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 7 == 0){
                System.out.println("Pau Casesnoves");
            } else if (i % 2 == 0) {
                System.out.println("Pau");
            } else if (i % 7 == 0) {
                System.out.println("Casesnoves");
            } else {
                System.out.println(i);
            }


        }
        sc.close();
    }
}
