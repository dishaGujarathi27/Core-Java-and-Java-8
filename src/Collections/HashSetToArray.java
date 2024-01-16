package Collections;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("HTML");
        hashSet.add("Angular");
        hashSet.add("React");


        String[] array=new String[hashSet.size()];

        //Convert HashSet to array
        hashSet.toArray(array);

        for (String s:array){
            System.out.println(s);
        }
    }
}
