package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>(); //Can store duplicate values

        ar.add(12);
        ar.add(21);
        ar.add(22);

        ar.add(11);
        ar.add(12);
        ar.add(20);

        Collections.sort(ar);
        System.out.println(ar);

        System.out.println("---------------------------------");

        Collections.reverse(ar);
        System.out.println(ar);

        System.out.println("\n");

         Collections.sort(ar,Collections.reverseOrder());
         System.out.println(ar);

        System.out.println("---------------------------------");

         ar.add(1,32);
         System.out.println(ar);

        System.out.println("---------------------------------");

        ar.remove(3);

        ar.forEach(e->  System.out.println(e));


//        for (Integer e: ar){
//            System.out.println(e);
//        }


        System.out.println("---------------------------------");

        ArrayList<Integer> qw=new ArrayList<>(Arrays.asList(12,1,23,45,5,6));

        for (Integer e1: qw){
            System.out.println(e1);
        }

        System.out.println("-------------------------------------------");

        //To use contains method for checking if the element is present or not
        if(ar.contains(12)){
            System.out.println(" Element Found ");
        }else {
            System.out.println(" Element not found ");
        }

        System.out.println(ar.size());

        //Merge two lists
        System.out.println("-------------------------------------------");

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("2");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList); // [1, 2]




    }

}
