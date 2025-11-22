package Exercicis5;
import java.util.Scanner;
public class E4_2Traductor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nombre (1-7): ");
        if (!sc.hasNextInt()) { System.out.println("Has d'introduir un nombre etner"); return; }
        int nombre = sc.nextInt();
        String dia = switch (nombre) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Número no vàlid";
        };
        if (dia.equals("Número no vàlid")) {
            System.out.println(dia);
            System.exit(1);
        }
        System.out.println("Today's " + dia);
        int longitud = dia.length();
        switch (longitud) {
            case 1, 2, 3, 4:
                System.out.println("Dia curt");
                break;
            case 5, 6:
                System.out.println("Dia normal");
                break;
            default:
                System.out.println("Dia llarg");
                break;
        }
        sc.close();
    }
}
