package Exercicis6;
import java.util.Scanner;
public class E6_2Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el teu consum elèctric: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Has d'introduir un nombre");
            return;
        }
        double consum = sc.nextDouble();
        System.out.println("Ara, el teu tipus de tarifa.\n1) Domèstica\n2) Empresarial");
        if (!sc.hasNextInt()) {
            System.out.println("Has d'introduir un dels nombres indicats");
            return;
        }
        int tarifa = sc.nextInt();
        if (tarifa != 1 && tarifa != 2) {
            System.out.println("Has d'introduir un dels nombres indicats");
            return;
        }
        System.out.println("I la teua franja horària.\nM) Matí\nT) Tarda\nN) Nit");
        char franja = sc.next().charAt(0);
        if (franja != 'M' && franja != 'T' && franja != 'N') {
            System.out.println("Has de triar una de les opcions de franges");
            return;
        }
        double calcul;
        switch (tarifa) {
            case 1:
                calcul = switch (franja) {
                    case 'M' -> 0.2;
                    case 'T' -> 0.25;
                    default -> 0.15;
                };
            default:
                calcul = switch (franja) {
                    case 'M' -> 0.3;
                    case 'T' -> 0.35;
                    default -> 0.28;
                };
        }
        double importTotal = consum*calcul;
        if (consum > 500) {
            System.out.println("L'import de " + importTotal + "$ s'ha vist reduït un 10% per superar els 500 kWh de consum (" + consum + ")");
            importTotal *= 0.9;
        }
        System.out.println("Import total: " + importTotal + "$");
        sc.close();
    }
}
