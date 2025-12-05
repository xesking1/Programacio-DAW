package ProvaExamen2;
import java.util.Scanner;

public class Exa2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;
        int opcio = 0;
        do {
            System.out.println("MENÚ\n\n1. Ingressar diners\n2. Retirar diners\n3. Mostrar saldo\n4. Sortir\n");
            if (!sc.hasNextInt()) {
                System.out.println("Només es poden introduir opcions del menú.\n");
                sc.nextLine();
                continue;
            }
            opcio = sc.nextInt();
            int operacio = 0;
            if (opcio == 1 || opcio == 2) {
                System.out.print("Quina quantitat? ");
                if (!sc.hasNextInt()) {
                    System.out.println("Només es poden ingressar/retirar valors enters.\n");
                    sc.nextLine();
                    continue;
                }
                operacio = sc.nextInt();
            }
            switch (opcio) {
                case 1:
                    if (operacio >= 0) {
                        saldo += operacio;
                        System.out.println("+" + operacio + "€ ingressats.\n");
                    } else {
                        System.out.println("No es poden ingressar valors negatius.\n");
                    }
                    break;
                case 2:
                    if (saldo-operacio < 0) {
                        System.out.println("No es pot retirar una quantitat major al saldo.\n");
                        continue;
                    } else {
                        System.out.println("-" + operacio + "€ retirats.\n");
                        saldo -= operacio;
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + saldo + "€\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opció no disponible al menú.\n");
                    break;
            }
        } while (opcio!=4);
        sc.close();
    }
}
