package provaExamen;
import java.util.Scanner;
public class NombresRomans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nobre romà: ");
        String roma = sc.next();
        int suma = 0;
        for (int i = 0 ; i < roma.length() ; i++) {
            int actual = switch (roma.charAt(i)){
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> {
                    System.out.println("Caràcters invàlids");
                    System.exit(0);
                    yield 0;
                }
            };
            int seg = 0;
            if (i+1 < roma.length()){
                seg = switch (roma.charAt(i+1)){
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> {
                        System.out.println("Caràcters invàlids");
                        System.exit(0);
                        yield 0;
                    }
                };
            }

            if (actual == 5 || actual == 50 || actual == 500) {
                if (actual == seg) { System.out.println("Nombre invàlid."); return; }
            } else {
                if (i + 3 < roma.length() && roma.charAt(i) == roma.charAt(i+1) && roma.charAt(i) == roma.charAt(i+2) && roma.charAt(i) == roma.charAt(i+3)) {
                    System.out.println("No es poden repetir 4 pics"); return;
                }
            }
            if (actual < seg) {
                switch (actual) {
                    case 1:
                        if (seg == 5 || seg == 10) {
                            suma += seg-actual;
                            i++;
                            continue;
                        } else { System.out.println("I només es resta a V i X. Caràcter " + i); return; }
                    case 10:
                        if (seg == 50 || seg == 100) {
                            suma += seg-actual;
                            i++;
                            continue;
                        } else { System.out.println("X només es resta a L i C. Caràcter " + i); return; }
                    case 100:
                        suma += seg-actual;
                        i++;
                        continue;
                }
            } else {
                suma += actual;
            }
        }
        System.out.println(suma);
        sc.close();
    }
}
