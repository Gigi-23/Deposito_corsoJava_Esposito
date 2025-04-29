import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prezzoBase = 500;
        double prezzoFinale = prezzoBase;

        // 1. Età del conducente
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        if (eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            scanner.close();
            return;
        } else if (eta >= 18 && eta <= 25) {
            prezzoFinale += prezzoBase * 0.20;
        } else if (eta > 50) {
            prezzoFinale -= prezzoBase * 0.10;
        }

        // 2. Anni di esperienza alla guida
        System.out.print("Inserisci gli anni di esperienza alla guida: ");
        int esperienza = scanner.nextInt();

        if (esperienza < 2) {
            prezzoFinale += prezzoBase * 0.30;
        }

        // 3. Numero di incidenti
        System.out.print("Inserisci il numero di incidenti negli ultimi 5 anni: ");
        int incidenti = scanner.nextInt();

        if (incidenti > 4) {
            System.out.println("Non sei idoneo per l'assicurazione.");
            scanner.close();
            return;
        }

        switch (incidenti) {
            case 1:
                prezzoFinale += prezzoBase * 0.15;
                break;
            case 2:
            case 3:
            case 4:
                prezzoFinale += prezzoBase * 0.30;
                break;
            case 0:
                break;
            default:
                System.out.println("Numero di incidenti non valido.");
                scanner.close();
                return;
        }

        // 4. Scelta pacchetto assicurativo
        System.out.println("Scegli il pacchetto assicurativo:");
        System.out.println("1. Base");
        System.out.println("2. Intermedio (+20%)");
        System.out.println("3. Premium (+50%)");
        System.out.print("Scelta (1-3): ");
        int pacchetto = scanner.nextInt();

        switch (pacchetto) {
            case 1:
                break;
            case 2:
                prezzoFinale += prezzoBase * 0.20;
                break;
            case 3:
                prezzoFinale += prezzoBase * 0.50;
                break;
            default:
                System.out.println("Scelta del pacchetto non valida. Nessuna modifica applicata.");
                break;
        }

        // 5. Prezzo dell'assicurazione
        System.out.printf("Il preventivo finale dell'assicurazione è: €%.2f%n", prezzoFinale);

        scanner.close();
    }
}

