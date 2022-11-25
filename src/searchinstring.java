public class searchinstring {
    public static void main(String[] args){
        String name= "vatsal";
        char target;
        target ='t';
        System.out.println(saerch(name,target));

    }

    static boolean saerch(String str, char target) {
        if(str.length()==0) {
            return false;
        }

        for (int i = 0; i < str. length (); i++) {
            if (target == str.charAt (i)) {
                return true;
            }

    }
}
