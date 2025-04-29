import java.util.Scanner;

public class CondizioniSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero (1-7) per il giorno della settimana: ");
        int day = scanner.nextInt();

        switch (giorno) {
            case 1:
                System.out.println("Lunedi");
                break;
            case 2:
                System.out.println("Martedi");
                break;
            case 3:
                System.out.println("Mercoledi");
                break;
            case 4:
                System.out.println("Giovedi");
                break;
            case 5:
                System.out.println("Venerdi");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Giorno non valido");
                break;
        }

        scanner.close();
    }
}

                
