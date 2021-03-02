package second_week.tables;

import java.util.Arrays;
import java.util.Collections;


public class zadanie_5 {
    public static void main(String[] args) {
        Integer[] liczby={15,7,4,13,20,21,37,420,6,1,9,11,77,44,8,10,81,289,19,30};
        Arrays.sort(liczby,0,9, Collections.reverseOrder());
        Arrays.sort(liczby,10,20);
        System.out.println("Tablica: "+Arrays.toString(liczby));
    }
}
