import java.util.Arrays;
import java.util.Scanner;

public class arr2d {
    public static void main(String[] args){
        int[][] arr=new int[3][3];
       Scanner sc= new Scanner(System.in);
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<arr.length;i++){
           System.out.println(Arrays.toString(arr[i]));
        }


    }
}
