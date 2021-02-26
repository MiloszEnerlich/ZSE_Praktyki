package first_week.loops;

import java.util.Scanner;

public class zadanie_3 {
    public static void main(String[] args) {

        String login1="admin";
        String haslo1="kremowka123";

        Scanner skaner=new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login2= skaner.next();

        System.out.println("Podaj hasło: ");
        String haslo2= skaner.next();

        if (login1.equals(login2)){
            if (haslo1.equals(haslo2)){
                System.out.println("Pomyślnie zalogowano.");
            }else
            {
                System.out.println("Nieprawidłowy login lub hasło.");
            }
        }else
        {
            System.out.println("Nieprawidłowy login lub hasło.");
        }
    }
}
