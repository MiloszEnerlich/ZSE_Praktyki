package first_week.loops;

import java.util.Scanner;

public class zadanie_5 {
    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);

        System.out.println("Podaj 1. liczbę: ");
        double a=skaner.nextInt();

        System.out.println("Podaj 2. liczbę: ");
        double b=skaner.nextInt();

        System.out.println("Wybierz operację która chcesz wykonać (+,-,*,/): ");
        String wybor=skaner.next();

        switch(wybor){
            case "+":
                double  suma=a+b;
                System.out.println("Wynik dodawania wynosi: " +suma);
                break;

            case "-":
                double  roznica=a-b;
                System.out.println("Wynik odejmowania wynosi: " +roznica);
                break;

            case "*":
                double  iloczyn=a*b;
                System.out.println("Iloczyn tych liczb wynosi: " +iloczyn);
                break;

            case "/":
                double  iloraz=a/b;
                System.out.println("Iloraz tych liczb wynosi: " +iloraz);
                break;
        }
    }
}
