package Exercicis4;
import java.util.Scanner;
public class E4_3CatSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el teu sou anual: ");
        double souAnual = sc.nextDouble();
        System.out.print("I la teva antiguitat en anys a l'empresa: ");
        int antiguitat = sc.nextInt();

        int rang;
        if (souAnual <= 20000){
            rang = 1;
        } else if (souAnual <= 50000) {
            rang = 2;
        } else {
            rang = 3;
        }

        double souFinal = souAnual;
        String categoria = "";
        double bonificacio = 0;
        double impost = 0;
        switch (rang) {
            case 1:
                categoria = "Junior";
                bonificacio = 5 * antiguitat;
                souFinal += souAnual*bonificacio/100;
                if (souFinal > 25000){
                    souFinal *= 0.98;
                    impost = 0.02;
                }
                break;
            case 2:
                categoria = "Intermedi";
                bonificacio = 3 * antiguitat;
                souFinal += souAnual*bonificacio/100;
                if (antiguitat > 10) {
                    souFinal *= 0.99;
                    impost = 0.01;
                }
                break;
            case 3:
                categoria = "Sènior";
                bonificacio = 2 * antiguitat;
                souFinal += souAnual*bonificacio/100;
                if (souFinal > 60000) {
                    souFinal *= 0.97;
                    impost = 0.03;
                }
                break;

        }
        System.out.print(categoria + ": +" + bonificacio/antiguitat +"% per any (" + bonificacio/100*souAnual + "$)\nSou fora imposts: " + souFinal/(1-impost) + "$\nImpost extra de " + (int)(impost*100) + "% (-" + souFinal/(1-impost)*impost + "$)\nSou final: " + souFinal + "$\n");
        sc.close();
    }
}
