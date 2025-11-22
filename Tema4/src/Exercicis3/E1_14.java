package Exercicis3;
import java.util.Scanner;
public class E1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre enter positiu: ");

        int binari = 0;
        int mult = 1;
        for (int decimal = sc.nextInt() ; decimal > 0 ; decimal/=2) {
            int residu = decimal%2; // guard el residu per major facilitat
            binari += residu*mult; // el residu, cada vegada es multiplica per una potencia de 10 major,
            // perquè quedi l'1 o el 0 a la posició que toca. 
            mult*=10; // següent potència de 10
        }
        System.out.println("Conversió a binari: " + binari);
        sc.close();
    }
}
