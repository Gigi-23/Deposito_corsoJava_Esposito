import java.util.Scanner; // Importa la classe Scanner

public class ScannerProva {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Crea Scanner per input stringa
    System.out.println("Enter username");
    String userName = scanner.nextLine(); // Legge il nome utente
    System.out.println("Username is: " + userName);

    Scanner scannerInt = new Scanner(System.in); // Crea Scanner per input intero
    System.out.println("Enter age");
    int userAge = scannerInt.nextInt(); // Legge l'età
    System.out.println("Age is: " + userAge);
  }
}