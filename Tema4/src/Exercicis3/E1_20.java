package Exercicis3;
import java.util.Scanner;
public class E1_20 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Començam amb el càlcul del valor del magatzem: ");

        System.out.print("Introdueix el nom del primer producte: ");
        String prod1 = lector.nextLine();
        System.out.print("La quantitat: ");
        int quantProd1 = lector.nextInt();
        System.out.print("El preu per unitat: ");
        double preuProd1 = lector.nextDouble();
        double preuMult1 = quantProd1 * preuProd1;
        lector.nextLine(); // fer net el buffer

        System.out.print("\nIntrodueix el del segon producte: ");
        String prod2 = lector.nextLine();
        System.out.print("La quantitat: ");
        int quantProd2 = lector.nextInt();
        System.out.print("El preu per unitat: ");
        double preuProd2 = lector.nextDouble();
        double preuMult2 = quantProd2 * preuProd2;
        lector.nextLine();

        System.out.print("\nEl del tercer: ");
        String prod3 = lector.nextLine();
        System.out.print("La quantitat: ");
        int quantProd3 = lector.nextInt();
        System.out.print("El preu per unitat: ");
        double preuProd3 = lector.nextDouble();
        double preuMult3 = quantProd3 * preuProd3;
        lector.nextLine();

        System.out.print("\nEl del quart: ");
        String prod4 = lector.nextLine();
        System.out.print("La quantitat: ");
        int quantProd4 = lector.nextInt();
        System.out.print("El preu per unitat: ");
        double preuProd4 = lector.nextDouble();
        double preuMult4 = quantProd4 * preuProd4;
        lector.nextLine();

        System.out.print("\nI el cinquè: ");
        String prod5 = lector.nextLine();
        System.out.print("La quantitat: ");
        int quantProd5 = lector.nextInt();
        System.out.print("El preu per unitat: ");
        double preuProd5 = lector.nextDouble();
        double preuMult5 = quantProd5 * preuProd5;
        lector.nextLine();

        double preuMag = preuMult1 + preuMult2 + preuMult3 + preuMult4 + preuMult5;

        System.out.println("\n----- VALOR DEL MAGATZEM -----");
        System.out.println(prod1 + ": " + quantProd1 + " unitats x " + preuProd1 + "$ = " + preuMult1 + "$");
        System.out.println(prod2 + ": " + quantProd2 + " unitats x " + preuProd2 + "$ = " + preuMult2 + "$");
        System.out.println(prod3 + ": " + quantProd3 + " unitats x " + preuProd3 + "$ = " + preuMult3 + "$");
        System.out.println(prod4 + ": " + quantProd4 + " unitats x " + preuProd4 + "$ = " + preuMult4 + "$");
        System.out.println(prod5 + ": " + quantProd5 + " unitats x " + preuProd5 + "$ = " + preuMult5 + "$");
        System.out.println("-------------------------------\n Valor total del magatzem: " + preuMag + "$");
        // -----------------------------------------------------------------------------------------------------
        double preuMagIva = preuMag * 1.21;
        double beneficiBrut = preuMag * 0.3;

        System.out.println("\n===============================================================\n\t\t\tTECNOCALC SL - INFORME MAGATZEM\n===============================================================");
        System.out.println("Producte\tQuantitat\tPreu/u\t\tTotal\n---------------------------------------------------------------");
        System.out.println(prod1 + "\t\t" + quantProd1 + "\t\t" + preuProd1 + "$\t\t" + preuMult1 + "$");
        System.out.println(prod2 + "\t\t" + quantProd2 + "\t\t" + preuProd2 + "$\t\t" + preuMult2 + "$");
        System.out.println(prod3 + "\t\t" + quantProd3 + "\t\t" + preuProd3 + "$\t\t" + preuMult3 + "$");
        System.out.println(prod4 + "\t\t" + quantProd4 + "\t\t" + preuProd4 + "$\t\t" + preuMult4 + "$");
        System.out.println(prod5 + "\t\t" + quantProd5 + "\t\t" + preuProd5 + "$\t\t" + preuMult5 + "$");
        System.out.println("---------------------------------------------------------------");
        System.out.println("TOTAL SENSE IVA: " + preuMag + "$");
        System.out.println("TOTAL AMB IVA (21%): " + preuMagIva + "$");
        System.out.println("BENEFICI BRUT ESTIMAT: " + beneficiBrut + "$");
        System.out.println("===============================================================\n\n");
        // -----------------------------------------------------------------------------------------------------
        //CLIENT #1

        int totalFinalClients = 0;
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println("CLIENT #" + i);

            System.out.print("Introdueix el nom del client: ");
            String nomClient = lector.nextLine();
            System.out.print("Ara, el seu DNI: ");
            String dniClient = lector.nextLine();
            System.out.print("I la seva direcció: ");
            String direccioClient = lector.nextLine();

            System.out.print("Quants " + prod1 + " compra? ");
            int clQuantProd1 = lector.nextInt();
            System.out.print("Quants " + prod2 + "? ");
            int clQuantProd2 = lector.nextInt();
            System.out.print("Quants " + prod3 + "? ");
            int clQuantProd3 = lector.nextInt();
            System.out.print("Quants " + prod4 + "? ");
            int clQuantProd4 = lector.nextInt();
            System.out.print("I quants " + prod5 + "? ");
            int clQuantProd5 = lector.nextInt();

            double clPreuMult1 = preuProd1 * clQuantProd1;
            double clPreuMult2 = preuProd2 * clQuantProd2;
            double clPreuMult3 = preuProd3 * clQuantProd3;
            double clPreuMult4 = preuProd4 * clQuantProd4;
            double clPreuMult5 = preuProd5 * clQuantProd5;

            double clTotalNoIva = clPreuMult1 + clPreuMult2 + clPreuMult3 + clPreuMult4 + clPreuMult5;
            double clTotalIva = clTotalNoIva * 1.21;
            double clDescompte = (clTotalIva > 1000) ? clTotalIva * 0.1 : 0;
            double clTotalFinal = clTotalIva - clDescompte;
            totalFinalClients += clTotalFinal;

            System.out.println("\n================================================================\n\t\t\t\t\t\t   FACTURA\n================================================================");
            System.out.println("Client: " + nomClient);
            System.out.println("DNI: " + dniClient);
            System.out.println("Direcció: " + direccioClient);
            System.out.println("===============================================================");
            System.out.println("Producte\tQuantitat\tPreu/u\t\tTotal");
            System.out.println("---------------------------------------------------------------");
            System.out.println(prod1 + "\t\t" + clQuantProd1 + "\t\t" + preuProd1 + "$\t\t" + clPreuMult1 + "$");
            System.out.println(prod2 + "\t\t" + clQuantProd2 + "\t\t" + preuProd2 + "$\t\t" + clPreuMult2 + "$");
            System.out.println(prod3 + "\t\t" + clQuantProd3 + "\t\t" + preuProd3 + "$\t\t" + clPreuMult3 + "$");
            System.out.println(prod4 + "\t\t" + clQuantProd4 + "\t\t" + preuProd4 + "$\t\t" + clPreuMult4 + "$");
            System.out.println(prod5 + "\t\t" + clQuantProd5 + "\t\t" + preuProd5 + "$\t\t" + clPreuMult5 + "$");
            System.out.println("---------------------------------------------------------------");
            System.out.println("TOTAL SENSE IVA: " + clTotalNoIva + "$");
            System.out.println("TOTAL AMB IVA (21%): " + clTotalIva + "$");
            System.out.println("DESCOMPTE (10%): " + clDescompte + "$");
            System.out.println("TOTAL FINAL: " + clTotalFinal + "$");
            System.out.println("===============================================================\n");
            lector.nextLine();
        }
        // -----------------------------------------------------------------------------------------------------
        // BENEFICIS
        int beneficiClients = (int)(totalFinalClients * 0.3);

        System.out.println("========================================");
        System.out.println("\tTECNOCALC SL - BENEFICIS");
        System.out.println("========================================");
        System.out.println("BENEFICI BRUT ESTIMAT: " + (int)beneficiBrut + "$");
        System.out.println("BENEFICI OBTINGUT DELS CLIENTS: " + beneficiClients + "$");
        System.out.println("BENEFICI NO OBTINGUT ENCARA: " + (int)(beneficiBrut-beneficiClients) + "$");
        System.out.println("========================================\n");
        // -----------------------------------------------------------------------------------------------------
        // BITLLETS OBTINGUTS
        int restaBitllets = beneficiClients;
        System.out.println("Bitllets obtinguts del benefici dels clients: ");
        System.out.println("500$: " + restaBitllets/500);
        restaBitllets = restaBitllets%500;
        System.out.println("200$: " + restaBitllets/200);
        restaBitllets = restaBitllets%200;
        System.out.println("100$: " + restaBitllets/100);
        restaBitllets = restaBitllets%100;
        System.out.println("50$: " + restaBitllets/50);
        restaBitllets = restaBitllets%50;
        System.out.println("20$: " + restaBitllets/20);
        restaBitllets = restaBitllets%20;
        System.out.println("10$: " + restaBitllets/10);
        restaBitllets = restaBitllets%10;
        System.out.println("5$: " + restaBitllets/5);
        restaBitllets = restaBitllets%5;
        lector.close();
    }
}
