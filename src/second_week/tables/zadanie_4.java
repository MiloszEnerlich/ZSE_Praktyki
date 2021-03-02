package second_week.tables;

import java.util.Arrays;
import java.util.Random;

public class zadanie_4 {
    public static void main(String[] args) {
        Random rand=new Random();
        String[] jedzenie={"Pizza","Kurczak z ryżem","Tosty","Płatki","Nic","Lasgne","Rosół","Kanapki","Spaghetti","Jajecznica"};
        int rand_int1= rand.nextInt(9);
        int rand_int2= rand.nextInt(9);
        int rand_int3= rand.nextInt(9);
        System.out.println("Na śniadanie zjem: "+jedzenie[rand_int1]+", na obiad zjem: "+jedzenie[rand_int2]+", na kolację: "+jedzenie[rand_int3]);
    }
}