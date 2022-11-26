import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generator losowej liczby i input użytkownika.
        //TaloHomes404
        Random losowa = new Random();
        String imie;
        String wybor;
        Scanner input = new Scanner(System.in);


        System.out.println("Cześć! Zagrajmy ;)");
        System.out.println("Najpierw, jak mamy do Ciebie mówić?: ");
        imie = input.next();
        System.out.println("Witaj " + imie + " !");
        System.out.println("Możemy zaczynać? T/N");
        wybor = input.next();

        switch (wybor) {
            case "T":
                System.out.println("Zgadnij a więc liczbę z przedziału 1-10");
                break;
            case "t":
                System.out.println("Zgadnij a więc liczbę z przedziału 1-10");
                break;
            case "N":
                System.out.println("Lipa, wróć jak się zastanowisz");
                return;
            case "n":
                System.out.println("Lipa, wróć jak się zastanowisz");
                return;
        }//Zapytanie użytkownika czy chce zagrać, odpowiedz Tak (Y) przechodzi dalej, Nie (N) kończy działanie programu

        int liczba = losowa.nextInt(10) + 1; //Generowanie liczby z przedziału 1-10 jak w zadaniu
        int proba;

        for (int i = 5; i > 0; i--) {
            proba = input.nextInt();

            if (proba == liczba) {
                System.out.println("Brawo! Odgadłeś liczbę! Było to: " + liczba);
                return;
            } else if (proba > liczba || i < 4) {
                System.out.println("Nie trafiłeś! Celuj niżej.");
                System.out.println("Pozostała liczba prób: " + (i-1));
            } else if (proba < liczba || i < 4) {
                System.out.println("Nie trafiłeś! Celuj wyżej.");
                System.out.println("Pozostała liczba prób: " + (i-1));
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Liczba do zgadnięcia to: "+liczba);
        System.out.println("Niestety nie udało Ci się zgadnąć losowej liczby, spróbuj następnym razem!");
        return;
    }
}
