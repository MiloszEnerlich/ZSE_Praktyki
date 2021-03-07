package second_week.listy;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class listy {
    public static void main(String[] args) {
        ArrayList<String> lista_Seriali = new ArrayList<>();
        lista_Seriali.add("The 100");
        lista_Seriali.add("Rick and Morty");
        lista_Seriali.add("Stranger Things");
        lista_Seriali.add("Breaking Bad");
        System.out.println(lista_Seriali);

        //Dodawanie
        lista_Seriali.add("Riverdale");
        lista_Seriali.add(1,"Dom z Papieru");
        System.out.println("\n" + lista_Seriali);

        //Odejmowanie
        lista_Seriali.remove("The 100");
        lista_Seriali.remove(0);
        System.out.println("\n" + lista_Seriali);

        //Nadpisywanie
        lista_Seriali.set(3,"Family Guy");
        System.out.println("\n" + lista_Seriali);

        //Sortowanie
        Collections.sort(lista_Seriali);
        System.out.println("\n" + lista_Seriali);

        //Czyszczenie
        lista_Seriali.clear();
        System.out.println("\n" + lista_Seriali);
    }
}
