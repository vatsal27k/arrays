import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){
        System.out.println("hihihihihihihihihi");
        ArrayList<Integer> list= new ArrayList<>(10);

        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();

        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<a;i++){
            System.out.print(list.get(i)+" ");
        }


        System.out.println("\n"+list);

    }
}
