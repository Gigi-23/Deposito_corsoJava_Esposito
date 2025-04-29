public class ProvaCondizioni {

    public static void main(String[] args) {

        // Dichiarazione di due variabili intere
        int x = 20;
        int y = 18;

        // Controlla se x è maggiore di y
        if (x > y) {
            System.out.println("x is greater than y"); // Output: x is greater than y
        }

        // Dichiarazione della variabile time
        int time = 20;

        // Primo controllo sul valore di time
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); // Output: Good evening.
        }

        // Secondo controllo con struttura if - else if - else
        if (time < 8) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); // Output: Good evening.
        }

        // Operatore ternario
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}





    
    

