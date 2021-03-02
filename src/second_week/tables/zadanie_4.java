package second_week.tables;

import java.util.Arrays;
import java.util.Random;

public class zadanie_4 {
    public static void main(String[] args) {
        Random rand=new Random();
        String[] sniadanie={"Tosty","Płatki","Nic","Kanapki","Jajecznicę"};
        String[] obiad={"Pizzę","Kurczaka z ryżem","Tosty","Nic","Lasgne","Rosół","Kanapki","Spaghetti"};
        String[] kolacja={"Pizza","Kurczak z ryżem","Tosty","Płatki","Nic","Lasgne","Rosół","Kanapki","Spaghetti"};
        int rand_int1= rand.nextInt(5);
        int rand_int2= rand.nextInt(8);
        int rand_int3= rand.nextInt(9);
        System.out.println("Na śniadanie zjem: "+sniadanie[rand_int1]+", na obiad zjem: "+obiad[rand_int2]+", na kolację: "+kolacja[rand_int3]);
    }
}