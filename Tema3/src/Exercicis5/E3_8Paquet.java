package Exercicis5;
import java.util.Scanner;
public class E3_8Paquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el pes del paquet: ");
        if (!sc.hasNextDouble()) {
            System.out.print("Has d'introduir un nombre");
            return;
        }
        double pes = sc.nextDouble();
        System.out.println("I la zona d'enviament (local/nacional/internacional): ");
        String zona = sc.next();

        double costFinal = 0;
        if (zona.equals("local")) {
            costFinal = 5 + 0.5*pes;
            System.out.println("Preu enviament local: 5$ + 0.5$/kg (" + pes*0.5 + "$)");
        } else if (zona.equals("nacional")) {
            costFinal = 8 + pes;
            System.out.println("Preu enviament nacional: 8$ + 1$/kg (" + pes + "$)");
        } else if (zona.equals("internacional")) {
            costFinal = 15 + 3*pes;
            System.out.println("Preu enviament internacional: 15$ + 3$/kg (" + pes*3 + "$)");
        } else {
            System.out.println("Introdueix una zona vàlida");
            System.exit(0);
        }
        System.out.println("Cost enviament: " + costFinal + "$");
        if (pes > 10) {
            System.out.println("Taxa per superar els 10kg: " + costFinal*0.1 + "$");
            costFinal *= 1.1;
        }
        if (costFinal > 50) {
            System.out.println("Descompte per enviament superior a 50$: -" + costFinal*0.05 + "$");
            costFinal *= 0.95;
        }
        System.out.println("Cost final: " + costFinal + "$");
    }
}
