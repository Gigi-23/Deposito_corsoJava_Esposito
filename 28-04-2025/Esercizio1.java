import java.util.Scanner;  // Importa la classe Scanner per leggere input da tastiera

public class Esercizio1 {
    public static void main(String[] args) {
        
        System.out.println("Inserire un int:");
        Scanner scanner = new Scanner(System.in);  // Crea lo scanner per leggere l'input
        int var_Int = scanner.nextInt();  // Legge un numero intero
        
        System.out.println("Inserire un float:");
        float var_Float = scanner.nextFloat();  // Legge un numero float

        System.out.println("Inserire un double:");
        double var_Double = scanner.nextDouble();  // Legge un numero double

        System.out.println("Inserire un boolean:");
        boolean var_Bool = scanner.nextBoolean();  // Legge un valore booleano

        scanner.nextLine();  // Consuma il carattere di newline rimasto nel buffer

        System.out.println("Inserire una String:");
        String var_String = scanner.nextLine();  // Legge una stringa di testo

        // Stampa i valori inseriti
        System.out.println(var_Int);
        System.out.println(var_Float);
        System.out.println(var_Double);
        System.out.println(var_Bool);
        System.out.println(var_String);

        scanner.close();  // Chiude lo scanner
    }
}