package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>(); //Does not store duplicate values
        hashSet.add("Harry Potter");
        hashSet.add("Casper");
        hashSet.add("Stuart Little");
        hashSet.add("Kung Fu Panda");


        Iterator<String> it= hashSet.iterator();
        System.out.println(it);
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------------------------------------");

        HashSet<String> hashSet1=new HashSet<>();
        hashSet1.add("Harry Potter");
        hashSet1.add("Casper");
        hashSet1.add("Stuart Little");
        hashSet1.add("Kung Fu Panda");

       hashSet1.stream().forEach(System.out::println);





    }
}
