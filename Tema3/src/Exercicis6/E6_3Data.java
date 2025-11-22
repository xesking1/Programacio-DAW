package Exercicis6;
import java.util.Scanner;
public class E6_3Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un dia (1-31): ");
        if (!sc.hasNextInt()) {
            System.out.println("Ha de ser un nombre enter");
            System.exit(0);
        }
        int dia = sc.nextInt();
        System.out.println("El mes (1-12): ");
        if (!sc.hasNextInt()) {
            System.out.println("Ha de ser un nombre enter");
            System.exit(0);
        }
        int mes = sc.nextInt();
        System.out.println("I l'any: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ha de ser un nombre enter");
            System.exit(0);
        }
        int any = sc.nextInt();
        if (any == 0) {
            any--;
            System.out.println("Al calendari no existeix l'any 0. Es considera com l'any 1 a.C.");
        }
        String mesEscrit = switch (mes) {
            case 1  -> "gener";
            case 2  -> "febrer";
            case 3  -> "març";
            case 4  -> "abril";
            case 5  -> "maig";
            case 6  -> "juny";
            case 7  -> "juliol";
            case 8  -> "agost";
            case 9  -> "setembre";
            case 10 -> "octubre";
            case 11 -> "novembre";
            case 12 -> "desembre";
            default -> {
                System.out.println("Mes invàlid");
                System.exit(0);
                yield "desconegut";
            }
        };
        boolean anyTraspas = (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia < 1 || dia > 31) {
                    System.out.println("Dia invàlid, " + mesEscrit + " com a màxim té 31 dies (i el mínim és 1)");
                    System.exit(0);
                }
                break;
            case 2:
                if (anyTraspas) {
                    if (dia < 1 || dia > 29) {
                        System.out.println("Dia invàlid, " + mesEscrit + " com a màxim té 29 dies a anys de traspàs (i el mínim és 1)");
                        System.exit(0);
                    }
                } else {
                    if (dia < 1 || dia > 28) {
                        System.out.println("Dia invàlid, " + mesEscrit + " com a màxim té 28 dies a anys de no traspàs (i el mínim és 1)");
                        System.exit(0);
                    }
                }
                break;
            default: // resta de mesos
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia invàlid, " + mesEscrit + " com a màxim té 30 dies (i el mínim és 1)");
                    System.exit(0);
                }
                break;
        }
        String parSen = "senar";
        if (dia%2 == 0) { parSen = "parell"; }
        // idea post: String parSen = (dia % 2 == 0) ? "parell" : "senar";
        if (anyTraspas) { System.out.println(any + " és un any de traspàs"); }
        System.out.println("El mes (" + mes +") és " + mesEscrit + " i el dia (" + dia + ") és " + parSen);
        sc.close();
    }
}
