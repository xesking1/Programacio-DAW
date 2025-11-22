package Exercicis5;
import java.util.Scanner;
public class E4_6Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una temperatura en Celsius: ");
        if (!sc.hasNextDouble()) { System.out.println("Has d'introduir un nombre"); return; }
        double tempC = sc.nextDouble();
        System.out.println("Quina conversió vols fer (introdueix el nombre)?\n1)Fahrenheit\n2)Kelvin\n3)Rankine");
        String conversio = sc.next();

        double operacio = 0;
        char unitat = 0;
        switch (conversio) {
            case "1":
                conversio = "Fahrenheit";
                operacio = (tempC * 9/5) + 32;
                if(operacio>100){
                    System.out.println("Temperatura molt alta");
                } else if(operacio<0){
                    System.out.println("Temperatura sota zero");
                }
                unitat = 'F';
                break;
            case "2":
                conversio = "Kelvin";
                operacio = tempC + 273.15;
                if(operacio>373){
                    System.out.println("Bullint!");
                } else if(operacio<273){
                    System.out.println("Freda!");
                }
                unitat = 'K';
                break;
            case "3":
                conversio = "Rankine";
                operacio = (tempC * 1.8) + 491.67;
                if(operacio>671){
                    System.out.println("Extremament calent!");
                }
                unitat = 'R';
                break;
            default:
                System.out.println("Conversió incorrecta");
                System.exit(1);
        }
        System.out.println(tempC + "ºC a " + conversio + ": "  + operacio + "º" + unitat);
        sc.close();
    }
}

