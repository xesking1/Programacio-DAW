package Exercicis3;
import java.util.Scanner;
public class E3_7Admissio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva nota de batxillerat");
        double notaBatx = sc.nextDouble();
        System.out.println("Ara, la teva nota de l'examen d'accés");
        double notaExamen = sc.nextDouble();
        System.out.println("I si tens experiència laboral en el camp(true/false): ");
        boolean experiencia = sc.nextBoolean();

        double notaFinal = (notaBatx + notaExamen) / 2;
        if  (experiencia) {
            notaFinal += 0.5;
        }
        System.out.println("La nota final és: " + notaFinal);
        if  (notaFinal >= 5) {
            System.out.println("Admesa");
        } else if (notaFinal < 5 && notaFinal >= 4.5) {
            System.out.println("En llista d'espera");
        } else {
            System.out.println("No admesa");
        }


    }
}
