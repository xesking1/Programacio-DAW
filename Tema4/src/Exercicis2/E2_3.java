package Exercicis2;
import java.util.Scanner;

public class E2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Es generaran nombres aleatoris entre 1 i 50.");
        int random;
        int randomAnterior = 0;
        boolean iguals = false;
        int i = 0;
        do {
            random = (int)(Math.random()*50);
            System.out.println(random);
            if (random == randomAnterior) {iguals = true;}
            randomAnterior = random;
            i++;
        } while (!iguals);
        System.out.print("Ha pres " + i + "intents generar dos nombres iguals.");
    }
}
