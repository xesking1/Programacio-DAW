package Exercicis5;
import java.util.Scanner;
public class E3_5Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el teu consum elèctric mensual en kWh: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Has d'introduir un nombre");
            return;
        }
        double consum = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tens tarifa verda (si/no)? ");
        String respostaTarifa = sc.nextLine();
        boolean tarifaVerda = respostaTarifa.equals("si");

        double importTotal;
        if (consum <= 100) {
            importTotal = consum * 0.12;
            System.out.println("Es cobrarà a 0.12$ el kWh");
        } else if (consum > 100 && consum <= 300) {
            importTotal = consum * 0.15;
            System.out.println("Es cobrarà a 0.15$ el kWh");
        } else {
            importTotal = consum * 0.2;
            System.out.println("Es cobrarà a 0.20$ el kWh");
            if (consum > 500) {
                System.out.println("Addicionalment s'afegeix un 5% (" + importTotal*0.05 + "$) ja que el consum supera els 500 kWh");
                importTotal *= 1.05 ;
            }
        }
        if (tarifaVerda) {
            System.out.println("S'ha aplicat un descompte d'un 3% (" + importTotal*0.03 + "$)");
            importTotal *= 0.97;
        }
        System.out.println("Import total:  " + importTotal + "$");
    }
}