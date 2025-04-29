import java.util.Scanner;

public class EserciziCicli{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double credito = 10.00;
        int scelta;

        System.out.println("Distributore Automatico");
        System.out.println("Credito iniziale: €" + credito);

        // Ciclo del distributore
        do {
            // Mostra il menu
            System.out.println("\nScegli una bevanda:");
            System.out.println("1. Caffè - €1.50");
            System.out.println("2. Cappuccino - €2.00");
            System.out.println("3. Tè - €1.00");
            System.out.println("4. Acqua - €0.50");
            System.out.println("5. Uscire");
            System.out.print("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    if (credito >= 1.50) {
                        credito -= 1.50;
                        System.out.println("Hai preso un Caffè. Credito rimanente: €" + String.format("%.2f", credito));
                    } else {
                        System.out.println("Credito insufficiente per un Caffè.");
                    }
                    break;
                case 2:
                    if (credito >= 2.00) {
                        credito -= 2.00;
                        System.out.println("Hai preso un Cappuccino. Credito rimanente: €" + String.format("%.2f", credito));
                    } else {
                        System.out.println("Credito insufficiente per un Cappuccino.");
                    }
                    break;
                case 3:
                    if (credito >= 1.00) {
                        credito -= 1.00;
                        System.out.println("Hai preso un Tè. Credito rimanente: €" + String.format("%.2f", credito));
                    } else {
                        System.out.println("Credito insufficiente per un Tè.");
                    }
                    break;
                case 4:
                    if (credito >= 0.50) {
                        credito -= 0.50;
                        System.out.println("Hai preso un'Acqua. Credito rimanente: €" + String.format("%.2f", credito));
                    } else {
                        System.out.println("Credito insufficiente per un'Acqua.");
                    }
                    break;
                case 5:
                    System.out.println("Uscita selezionata.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

            if (credito < 0.50) {
                System.out.println("Credito esaurito. Uscita automatica...");
                break;
            }
                
        } while (scelta != 5);   // Il blocco continua a ripetersi finché l'utente NON sceglie "5" (uscita).
                                // Se il credito scende sotto 0.50€, viene usato un `break` per uscire prima.
                                
       

        // Messaggio finale
        System.out.println("\nGrazie per aver utilizzato il distributore.");
        System.out.println("Credito finale: €" + String.format("%.2f", credito));

        scanner.close();


    }
}
