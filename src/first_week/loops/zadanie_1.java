package first_week.loops;

import java.util.Scanner;

public class zadanie_1 {
    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba=skaner.nextInt();

        if (liczba>0){
            System.out.println("Podałeś liczbę większą od zera.");
        }
        if (liczba==0){
            System.out.println("Podałeś liczbę zero.");
        }
        if (liczba<0){
            System.out.println("Podałeś liczbę mniejszą od zera.");
        }
    }
}
