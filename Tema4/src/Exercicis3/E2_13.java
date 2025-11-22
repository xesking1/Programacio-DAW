package Exercicis3;
import java.util.Scanner;

public class E2_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pis = 0;
        int concret;
        for (int opcio = 0 ; opcio!=4 ;) {
            System.out.println("\nASCENSOR - Pis actual: " + pis + "\n-------------------------\n1. Pujar un pis\n2. Baixar un pis \n3. Anar a un pis concret \n4. Sortir\n");
            opcio = sc.nextInt();
            switch(opcio){
                case 1:
                    if (pis < 10) { pis++; }
                    else { System.out.println("No pots passar del pis 10."); }
                    break;
                case 2:
                    if (pis > -1) { pis--; }
                    else { System.out.println("No pots passar del pis -1."); }
                    break;
                case 3:
                    System.out.print("A quin pis vols anar? ");
                    concret = sc.nextInt();
                    if (concret > 10) { System.out.println("No pots passar del pis 10."); }
                    else if (concret < 1) { System.out.println("No pots passar del pis -1."); }
                    else if (concret == pis) { System.out.println("Ja et trobes a aquest pis"); }
                    else { pis=concret; }
                    break;
                case 4:
                    System.out.println("\nSortint de l'ascensor...");
                    break;
                default:
                    System.out.println("Opció invàlida.");
                    opcio = 0;
                    break;
            }
        }
    }
}
