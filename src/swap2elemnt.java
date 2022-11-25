import java.util.Arrays;

public class swap2elemnt {
    public static void main(String[] args){
        int[] arr={1,2,3,22,33,45,6,78,11};
        swap(arr,1,4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int i1) {
        int temp;
        temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;

    }
}
