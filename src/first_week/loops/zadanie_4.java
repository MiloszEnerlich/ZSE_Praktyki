package first_week.loops;

import java.util.Scanner;

public class zadanie_4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj 1. liczbę: ");
        int a = skaner.nextInt();

        System.out.println("Podaj 2. liczbę: ");
        int b = skaner.nextInt();

        System.out.println("Podaj 3. liczbę: ");
        int c = skaner.nextInt();

        if (a == b) {
            System.out.println("Brak kolejności.");
            }
        else
        {
            if (a > b) {
                if (b > c) {
                    System.out.println("Kolejność malejąca.");
                }else{
                    System.out.println("Brak kolejności.");
                    }

                }
            } if (b>a)
            {
                if (c > b) {
                    System.out.println("Kolejność rosnąca.");
                }else{
                    if (b==c){
                        System.out.println("Brak kolejności.");
                    }else
                    {
                        if (b>c){
                            System.out.println("Brak kolejności.");
                        }
                    }
                }
            }

        }
    }