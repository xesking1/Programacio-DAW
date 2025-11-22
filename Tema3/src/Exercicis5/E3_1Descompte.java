package Exercicis5;
import java.util.Scanner;
public class E3_1Descompte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //#1 DESCOMPTE
        System.out.println("Introdueix el nom d'un producte: ");
        if (sc.hasNextLine()) {
            String producte = sc.nextLine();
            System.out.println("I el preu: ");
            if (sc.hasNextDouble()) {
                double preu = sc.nextDouble();
                System.out.println("Ara, la teva edat: ");
                if (sc.hasNextInt()) {
                    int edat = sc.nextInt();
                    System.out.println("I quin dia de la setmana és avui (1-7): ");
                    if (sc.hasNextInt()) {
                        int diaSetmana = sc.nextInt();

                        double descompte = preu;
                        double preuFinal = preu;
                        if (edat < 18 || edat > 65) {
                            descompte *= 0.25;
                            preuFinal -= descompte;
                        } else if (diaSetmana == 3) {
                            descompte *= 0.1;
                            preuFinal -= descompte;
                        } else if (diaSetmana == 6 || diaSetmana == 7) {
                            descompte *= 0.05;
                            preuFinal -= descompte;
                        } else if (diaSetmana == 1 && edat == 25) {
                            preuFinal = 0;
                        }
                        System.out.println("Producte: " + producte + "$\nPreu: " + preu + "$\nDescompte: " + descompte + "$\nTotal: " + preuFinal + "$");
                    } else {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}