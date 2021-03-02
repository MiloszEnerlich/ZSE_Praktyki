package second_week.tables;

import java.util.Arrays;

public class zadanie_1 {
    public static void main(String[] args) {
        char[] charArray={'*','@','#','w','b','j','p','!','%','@'};
        Arrays.sort(charArray);
        System.out.println("Posortowane rosnąco: "+Arrays.toString(charArray));
    }
}
