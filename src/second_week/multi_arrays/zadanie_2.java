package second_week.multi_arrays;

import java.util.Arrays;

public class zadanie_2 {
    public static void main(String[] args) {
        int[][][][] arr=new int[3][3][3][3];
        int value=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    for (int l=0;l<3;l++){
                        arr[i][j][k][l]=value;
                        value+=2;
                        System.out.println("["+i+"]"+"["+j+"]"+"["+k+"]"+"["+l+"] = "+arr[i][j][k][l]+ "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
