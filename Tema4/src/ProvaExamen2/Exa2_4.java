
package ProvaExamen2;
import java.util.Scanner;

public class Exa2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio = sc.nextInt();
        do {
            System.out.println("MENU\n\n1. Convertir d'euros a dòlars\n2. Convertir de dòlars a euros" +
                    "\n3. Convertir d'euros a yens\n4. Convertir yens a euros\n5. Sortir");
            opcio = sc.nextInt();
            System.out.print("Quant vols convertir? ");
            double quant = sc.nextInt();
            double resultat = 0;
            if (quant < 0) {
                System.out.println("No estan permeses xifres negatives.\n");
                continue;
            }
            switch (opcio) {
                case 1:
                    resultat = quant*1.17;
                    break;
                case 2:
                    resultat = quant*0.86;
                    break;
                case 3:
                    resultat = quant*181.14;
                    break;
                case 4:
                    resultat = quant*0.0055;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opció no disponible al menú.\n");
                    break;
            }
            System.out.println(resultat);
        } while (opcio!=5);

        sc.close();
    }
}
