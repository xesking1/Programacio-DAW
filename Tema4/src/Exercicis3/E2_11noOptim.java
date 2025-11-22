package Exercicis3;
import java.util.Scanner;

public class E2_11noOptim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int any;
        int mes;
        int dia;
        boolean valid = false;
        boolean traspas = false;
        do {
            System.out.print("Introdueix l'any: ");
            any = sc.nextInt();
            if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) { traspas = true; }
            System.out.print("Introdueix el mes: ");
            mes = sc.nextInt();
            System.out.print("Introdueix el dia: ");
            dia = sc.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Mes invàlid");
                continue;
            } else {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        if (dia > 1 && dia <= 31) { valid = true; }
                        else { System.out.println("Dia invàlid."); }
                        break;
                    case 2:
                        if (traspas && dia > 1 && dia <= 28) { valid = true; }
                        else if (!traspas && dia > 1 && dia <= 29) { valid = true; }
                        else { System.out.println("Dia invàlid"); }
                        break;
                    default:
                        if (dia > 1 && dia <= 30) { valid = true; }
                        else { System.out.println("Dia invàlid."); }
                        break;
                }
            }
        } while (!valid);
        System.out.println("Data vàlida. " + dia + "/" + mes + "/" + any);
    }
}
