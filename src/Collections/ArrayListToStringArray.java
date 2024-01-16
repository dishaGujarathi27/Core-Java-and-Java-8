package Collections;

import java.util.ArrayList;

public class ArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Sheldon");
        arr.add("Penny");
        arr.add("Leonard");
        arr.add("Amy");
        System.out.println(arr);

        String[] names=arr.toArray(new String[arr.size()]);

        for(String ae:arr){
            System.out.println(ae);
        }




    }
}
