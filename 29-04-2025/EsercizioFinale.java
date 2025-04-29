import java.util.Scanner;

public class EsercizioFinale {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variabili per la registrazione
        String registratoUsername = "";
        String registratoPassword = "";

        // Variabili per il login
        String usernameInserito = "";
        String passwordInserita = "";
        boolean loginCompletato = false;

        // Registrazione
        while (registratoUsername.isEmpty() || registratoPassword.isEmpty()) {
            System.out.println("Crea il tuo account!");
            System.out.print("Inserisci un nome utente: ");
            registratoUsername = scanner.nextLine();

            System.out.print("Inserisci una password: ");
            registratoPassword = scanner.nextLine();
            System.out.println("Registrazione completata con successo!");
        }

        // Login
        while (!loginCompletato) {
            System.out.println("\nAccedi con il tuo account");
            System.out.print("Nome utente: ");
            usernameInserito = scanner.nextLine();

            System.out.print("Password: ");
            passwordInserita = scanner.nextLine();

            if (usernameInserito.equals(registratoUsername) && passwordInserita.equals(registratoPassword)) {
                loginCompletato = true;
                System.out.println("Login riuscito! Benvenuto " + registratoUsername);
            } else {
                System.out.println("Nome utente o password errati. Riprova.");
            }
        }

        // Calcolatrice a due fattori
        boolean continua = true;
        while (continua) {
            System.out.println("\nBenvenuto nel sistema della calcolatrice!");
            System.out.print("Inserisci il primo numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nScegli un'operazione:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");

            int scelta = scanner.nextInt();
            double risultato = 0;

            switch (scelta) {
                case 1:
                    risultato = num1 + num2;
                    break;
                case 2:
                    risultato = num1 - num2;
                    break;
                case 3:
                    risultato = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        risultato = num1 / num2;
                    } else {
                        System.out.println("Errore: divisione per zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    continue;
            }

            System.out.println("Il risultato è: " + risultato);

            // Opzione per poter continuare o uscire
            System.out.print("\nVuoi fare un altro calcolo? (si/no): ");
            String risposta = scanner.next();
            if (risposta.equalsIgnoreCase("no")) {
                continua = false;
            }
        }

        // Cambio dati
        System.out.print("\nVuoi cambiare i tuoi dati (nome utente o password)? (si/no): ");
        String cambiaDati = scanner.next();

        if (cambiaDati.equalsIgnoreCase("si")) {
            System.out.print("Inserisci il nuovo nome utente: ");
            registratoUsername = scanner.next();
            System.out.print("Inserisci la nuova password: ");
            registratoPassword = scanner.next();
            System.out.println("I tuoi dati sono stati aggiornati!");
        }

        System.out.println("Grazie per aver utilizzato il sistema!");
    }
}
