package provaExamen;
import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix nombre ");
        int n;
        if (sc.nextInt() < 0) System.out.println("Nombre invalid");
        else n = sc.nextInt();
        sc.next();


    }
}
