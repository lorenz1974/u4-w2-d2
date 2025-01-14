package u4w2d2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParoleDistinte {

    // Costruttore che esegue tutte le operazioni
    public ParoleDistinte(int numeroParole) {
        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le parole:");

        for (int i = 0; i < numeroParole; i++) {
            System.out.print("Parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            // Verifica duplicati
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        scanner.close();

        // Stampa i risultati
        System.out.print("\n".repeat(2));
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);
    }
}
