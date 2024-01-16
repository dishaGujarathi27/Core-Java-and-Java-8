package Collections;


import java.util.*;

public class TreeMapIteration {
    public static void main(String[] args) {

        TreeMap<Integer , String> treeMap=new TreeMap<>();
        treeMap.put(1,"Selenium");
        treeMap.put(2,"Ruby");
        treeMap.put(3,"Spring Boot");

        //get collection of values contained in treemap using collection values()
       Collection c=treeMap.values();


       //Iterate through treemap values iterator
        Iterator it= c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
