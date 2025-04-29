import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        // Creazione scanner per leggere l'input
        Scanner scanner = new Scanner(System.in);

        // Credenziali predefinite
        String correctUsername = "gigi";
        String correctPassword = "2904";

        // Input da tastiera per il nome utente
        System.out.print("Inserisci nome utente: ");
        String inputUsername = scanner.nextLine();

        // Input da tastiera per la password
        System.out.print("Inserisci password: ");
        String inputPassword = scanner.nextLine();

        // Verifica delle credenziali
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Accesso consentito.");
        } else {
            System.out.println("Nome utente o password errati.");
        }

        // Chiusura scanner
        scanner.close();
    }
}

