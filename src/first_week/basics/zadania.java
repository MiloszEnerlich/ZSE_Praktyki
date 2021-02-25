package first_week.basics;

public class zadania {
    public static void main(String[] args) {

        //Zadanie 1
        String word="Miłosz.";
        int wiek=17;
        double liczba=4.77;
        char znak='@';

        System.out.println("Mam na imię " +word);
        System.out.println("Mam " +wiek  +" lat.");
        System.out.println("Jakaś liczba: " +liczba);
        System.out.println("Jakiś znak specjalny: " +znak);

        System.out.println("\n\n");

        //Zadanie 2
        int a=3;
        int b=5;
        double wynik=a*a+b*b;
        System.out.println("Suma a^2 i b^2 wynosi: " +wynik);

        System.out.println("\n\n");

        //Zadanie 3
        int bok=7;
        double sqrt = Math.sqrt(3);
        double pole = bok*bok * sqrt/4;
        System.out.println("Pole równe jest " +pole);

        System.out.println("\n\n");

        //Zadanie 4
        String imie="Miłosz";
        String nazwisko="Enerlich";
        System.out.println("Nazywam się " +imie +" "+nazwisko);

    }
}
