public class ProvaStringhe {
    
        public static void main(String[] args) {
            // Esempio 1: Lunghezza di una stringa
            String txt1 = "234546";
            System.out.println("The length is: " + txt1.length()); // Corretto: .length() con "h"
    
            // Esempio 2: Conversione in maiuscolo e minuscolo
            String txt2 = "Hello World";
            System.out.println(txt2.toUpperCase()); // Outputs "HELLO WORLD"
            System.out.println(txt2.toLowerCase()); // Outputs "hello world"
    
            // Esempio 3: Trovare l'indice di una sottostringa
            String txt3 = "Please locate where 'locate' occurs!";
            System.out.println(txt3.indexOf("locate")); // Outputs 7
    
            // Concatenazione con l'operatore +
            String firstName1 = "John";
            String lastName1 = "Doe";
            System.out.println(firstName1 + " " + lastName1); // Output: John Doe
            
            // Concatenazione con il metodo concat()
            String firstName2 = "John ";
            String lastName2 = "Doe";
            System.out.println(firstName2.concat(lastName2)); // Output: John Doe


    

            // Somma di numeri interi
                    int x1 = 10;
                    int y1 = 20;
                    int z1 = x1 + y1; // z1 sarà 30
                    System.out.println("z1 (int + int): " + z1);
            
            // Concatenazione di stringhe numeriche
                    String x2 = "10";
                    String y2 = "20";
                    String z2 = x2 + y2; // z2 sarà "1020"
                    System.out.println("z2 (String + String): " + z2);
            
            // Concatenazione di stringa e numero intero
                    String x3 = "10";
                    int y3 = 20;
                    String z3 = x3 + y3; // z3 sarà "1020"
                    System.out.println("z3 (String + int): " + z3);

            // Dichiarazione di due stringhe con lo stesso valore
                    String pippo = "mirko";
                    String paragone = "mirko";

            // Verifica se le due stringhe sono uguali (contenuto identico)
                 System.out.println(pippo.equals(paragone)); // Output: true

           // Verifica se la stringa 'pippo' è vuota
                 System.out.println(pippo.isEmpty()); // Output: false, perché contiene "mirko"

           // Dichiarazione di una frase
                 String frase = "ciao come stai?";

           // Verifica se la stringa 'frase' contiene la parola "come"
                 System.out.println(frase.contains("come")); // Output: true



                 

                        }
                    }
                    
            