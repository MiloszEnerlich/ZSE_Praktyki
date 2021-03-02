package second_week.tables;

import java.util.Arrays;
import java.util.Collections;

public class zadanie_2 {
    public static void main(String[] args) {
        String[] stringArray={"Marcin","i","Rafał","to","kozacy","totalni","!","Ez","xD","~"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Posortowane malejąco: "+Arrays.toString(stringArray));
    }
}
