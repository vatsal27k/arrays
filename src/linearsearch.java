import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int[] nums={1,232,3,445,5,67,87,12,23,111,-9,-56,-4,-32,556};
        int target=sc.nextInt();

        int ans=linsearch2(nums,target);
        System.out.println(ans);


    }

    static int linsearch(int[] arr, int target){
        if(arr.length==0){
            return-1;
        }

        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }

        return -1;
    }

    static int linsearch2(int[] arr, int target){
        if(arr.length==0){
            return-1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return -1;
    }
}
