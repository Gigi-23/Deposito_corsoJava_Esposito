import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        // Creazione scanner per leggere l'input
        Scanner scanner = new Scanner(System.in);

        // Numero prefissato 
        int numeroSegreto = 23; // Numero scelto 

        // Chiede all'utente di inserire un numero
        System.out.print("Indovina un numero (tra 1 e 100): ");
        int tentativo = scanner.nextInt();

        // Verifica del risultato
        if (tentativo < numeroSegreto) {
            System.out.println("Il numero inserito è troppo basso.");
        } else if (tentativo > numeroSegreto) {
            System.out.println("Il numero inserito è troppo alto.");
        } else {
            System.out.println("Complimenti! Hai indovinato il numero.");
        }

        // Chiusura scanner
        scanner.close();
    }
}

   
