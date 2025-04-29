public class OperatoriAritmetici {
    public static void main(String[] args) {
        
        // Operazioni aritmetiche
        int x = 3;
        x += 5; // Incrementa x di 5
        System.out.println(x);

        x++; // Incremento di x
        System.out.println("Variabile x dopo l'incremento: " + x);

        x--; // Decremento di x
        System.out.println("Variabile x dopo il decremento: " + x);

        // Operatori di confronto
        int y = 3;
        int z = 5;
        
        System.out.println(y + " è maggiore di " + z + "? " + (y > z)); // Confronto maggiore
        System.out.println(y + " è uguale a " + z + "? " + (y == z)); // Confronto uguale
        System.out.println(y + " è diverso da " + z + "? " + (y != z)); // Confronto diverso

        // Operatori logici
        System.out.println(y < 10 && y > 5); // Confronto con AND logico
    }
}
