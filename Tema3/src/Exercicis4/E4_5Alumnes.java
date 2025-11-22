package Exercicis4;
import java.util.Scanner;
public class E4_5Alumnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva nota (0-100):");
        int nota = sc.nextInt();
        int nota1 = nota;
        System.out.print("I el teu percentatge d'assistència: ");
        int assistencia = sc.nextInt();

        int nota10 = nota/10;
        switch (nota10) {
            case 9:
                if (assistencia>90) {
                    nota += 5;
                } else if (assistencia<70) {
                    nota -= 2;
                }
                break;
            case 8:
                if (assistencia>80) {
                    nota += 3;
                } else if (assistencia<60) {
                    nota -= 2;
                }
                break;
            case 7:
                if (assistencia>70) {
                    nota += 2;
                } else if (assistencia<50) {
                    nota -= 1;
                }
                break;
            case 6:
                if (assistencia>60) {
                    nota += 1;
                } else if (assistencia<50) {
                    nota -= 1;
                }
                break;
            default:
                if (assistencia<40) {
                    System.out.println("Revisar assistència");
                }
                break;
        }
        if (nota>nota1) {
            System.out.println("Bonificació per % d'assistència");
        } else if (nota<nota1) {
            System.out.println("Penalització per % d'assistència");
        }
        System.out.println("Puntuació final: " + nota);
    }
}
