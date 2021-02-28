package first_week.loops;

import java.util.Scanner;

public class zadanie_2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj 1. liczbę: ");
        int a = skaner.nextInt();

        System.out.println("Podaj 2. liczbę: ");
        int b = skaner.nextInt();

        System.out.println("Podaj 3. liczbę: ");
        int c = skaner.nextInt();

        if (a == b) {
            if (a==c){
                System.out.println("Wszystkie liczby są równe.");
            }else {
                if (a > c) {
                    System.out.println("2 pierwsze liczby są równe i większe od 3.");
                } else {
                    System.out.println("3. liczba jest największa.");
                }
            }
        } else
            {
            if (a > b) {
                if (a > c) {
                    System.out.println("1. liczba jest największa.");
                }else{
                    if (a==c){
                        System.out.println("Liczby 1. i 3. są równe i większe od 2.");
                    }else
                    {
                        if (c>a){
                            System.out.println("3. liczba jest największa.");
                        }
                    }
                }
            } else
                {
                if (b > c) {
                    System.out.println("2. liczba jest największa.");
                }else{
                    if (b==c){
                        System.out.println("Liczby 2. i 3. są równe i większe od 1.");
                    }else
                    {
                        if (c>b){
                            System.out.println("3. liczba jest największa.");
                        }
                    }
                }
            }

        }
    }
}
