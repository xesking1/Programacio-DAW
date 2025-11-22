package Exercicis6;
import java.util.Scanner;
public class E6_1Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una hora (0-23): ");
        if (!sc.hasNextInt()) {
            System.out.println("Has d'introduir un nombre enter com a hora");
            return;
        }
        int hora = sc.nextInt();
        System.out.println("Ara, els minuts: ");
        if (!sc.hasNextInt()) {
            System.out.println("Has d'introduir un nombre enter com a hora");
        }
        int minuts = sc.nextInt();
        if (hora < 0 || hora > 23) {
            System.out.println("Hora invàlida (fora del rang)");
            return;
        } else if (minuts < 0 || minuts > 59) {
            System.out.println("Minuts invàlids (fora del rang)");
            return;
        }

        String horaText = switch (hora) {
            case 0, 12 -> "dotze";
            case 1, 13 -> "una";
            case 2, 14 -> "dues";
            case 3, 15 -> "tres";
            case 4, 16 -> "quatre";
            case 5, 17 -> "cinc";
            case 6, 18 -> "sis";
            case 7, 19 -> "set";
            case 8, 20 -> "vuit";
            case 9, 21 -> "nou";
            case 10, 22 -> "deu";
            case 11, 23 -> "onze";
            default -> "";
        };
        String faltenMin = switch (minuts) {
            case 15 -> " i quart";
            case 30 -> " i mitja";
            case 45 -> " menys quart";
            case 50 -> " menys deu";
            case 55 -> " menys cinc";
            default -> " i " + minuts;
        };


        if (hora <= 12) {
            switch (minuts) {
                case 45, 50, 55:
                    hora++;
                default:
            } // no funciona!
            if (hora == 1) {
                System.out.println("Són la " + horaText + faltenMin + " del dematí/matinada");
            } else {
                System.out.println("Són les " + horaText + faltenMin + " del dematí/matinada");
            }
        } else {
            if (hora == 13) {
                System.out.println("Són la " + horaText + faltenMin + " del capvespre/nit");
            } else {
                System.out.println("Són les " + horaText + faltenMin + " del capvespre/nit");
            }
        }
        sc.close();
    }
}
