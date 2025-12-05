package ProvaExamen2;
import java.util.Scanner;
public class Exa2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = false;
        int i = 0;
        do {
            System.out.print("Introdueix l'edat: ");
            int edat = sc.nextInt();
            System.out.print("El dia de la setmana (1-7): ");
            int dia = sc.nextInt();
            sc.nextLine();
            System.out.print("Tens carnet d'estudiant? (si/no): ");
            String siNo = sc.nextLine();
            boolean carnet;
            if (siNo.equalsIgnoreCase("si")) {
                carnet = true;
            } else if (siNo.equalsIgnoreCase("no")) {
                carnet = false;
            } else {
                System.out.println("Resposta invàlida. Torna a començar.\n");
                continue;
            }
            double entrada = 8;
            if (dia == 3) {
                System.out.println("Dimecres --> Preu fixe 5$");
                entrada = 5;
            } else {
                if (edat < 12) {
                    System.out.print("Descompte del 50% per menor de 12 anys (" + entrada + "$-" + entrada*0.5 + "$) = " + entrada*0.5 );
                    entrada *= 0.5;
                }
                if (carnet) {
                    System.out.print("Descompte d'1€ per tenir carnet d'estudiant (" + entrada + "$-" + (entrada-1) + "$) = " + (entrada-1));
                    entrada -= 1;
                }
            }
            i++;
            System.out.print("Entrada " + i + ": " + entrada + "$. Vols continuar? (si/no) ");
            siNo = sc.nextLine();
            if (siNo.equalsIgnoreCase("si")) {
                System.out.println("Tornant a començar...\n");
            } else if (siNo.equalsIgnoreCase("no")) {
                System.out.println("Finalitzant programa...");
                continuar = true;
            }
        } while (!continuar);
        sc.close();
    }
}
