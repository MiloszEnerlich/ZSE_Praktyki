package second_week.tables;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadanie_3 {
    public static void main(String[] args) {
        Random rand=new Random();
        String[] imiona={"Pimpek","Rex","Alex"};
        int rand_int1= rand.nextInt(3);
        System.out.println("Imię dla psa: "+imiona[rand_int1]);
    }
}
