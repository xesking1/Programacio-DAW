package Exercicis6;
import java.util.Scanner;
public class E6_4Candidat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest programa et farà una avaluació pel lloc de feina.\n--------------------------------------------------------");
        System.out.println("Introdueix la teva edat: ");
        if (!sc.hasNextInt()) { System.out.println("Ha de ser un nombre enter"); System.exit(0); }
        int edat = sc.nextInt();
        System.out.print("El teu coneixement d'idiomes.\n1) cap\n2) anglès\n3) anglès i francès\n4) anglès, francès i alemany\n");
        if (!sc.hasNextInt()) { System.out.println("Ha de ser un nombre enter"); System.exit(0); }
        int idiomes = sc.nextInt();
        System.out.print("I la teva titulació.\n1) ESO\n2) Batxillerat\n3) CFGS\n4) Grau universitari\n");
        if (!sc.hasNextInt()) { System.out.println("Ha de ser un nombre enter"); System.exit(0); }
        int titulacio = sc.nextInt();
        boolean edatApta = edat >= 18 && edat <= 45;
        boolean idiomesAptes = idiomes >= 2 && idiomes <= 4; // opció 2, tinguent en compte que es compta
        // el català, encara que també és extrany que un catalanoparlant no sàpiga també castellà
        boolean titulacioApta = titulacio >= 3 && titulacio <= 4;
        if (!edatApta || !idiomesAptes || !titulacioApta) {
            if (!edatApta) {
                if (edat < 0) {System.out.println("No s'admeten valors negatius com a edat.");}
                else if (edat > 120) {System.out.println("Estàs segur de tenir " + edat + " anys?");} // edat ilògica
                else if (edat < 18) {System.out.println("Massa jove");} else {System.out.println("Massa gran");} // 45-120 (boolean i if anterior)
            } if (!idiomesAptes) {
                if (idiomes == 1) {System.out.println("Idiomes insuficients");}
                else {System.out.println("Valor introduït pels idiomes invàlid");} // qualsevol altre valor serà fora del rang (cond boolean)
            } if (!titulacioApta) {
                if (titulacio < 3 && titulacio > 0) {System.out.println("Titulació insuficient");}
                else {System.out.println("Valor introduit per la titulació invàlid");} // valors fora del rang (boolean)
            }
        } else {System.out.println("\nApte pel lloc de feina!");} // 3 booleans = true, apte
        sc.close();
    }
}
