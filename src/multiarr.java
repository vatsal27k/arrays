import java.util.Scanner;
import java.util.Arrays;

public class multiarr {
    public static void  main(String[] args){
        int[][] arr= new int[][]{
                {1, 2, 3, 4},
                {5, 6},
                {1, 1, 1, 1, 1}
        };

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+"_");
            }
            System.out.println();
        }

        System.out.println(arr[0][0]);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr[2]));
    }
}

