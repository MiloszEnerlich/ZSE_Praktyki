package second_week.real_loops;

public class zadanie_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++){
                System.out.println("[i:"+ i + "]"+"[j:"+ j +"]\t" + i +" * " + j + " = " + i * j +"\t");
                if ((i*j)%2==0){
                    System.out.println("liczba jest parzysta");
                }
                else{
                    System.out.println("Liczba jest nieparzysta");
                }
            }
            System.out.println("\n");
        }
    }
}
