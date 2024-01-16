package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String , String> m=new HashMap<>();//only one key can be null
        m.put("1","Disha");
        m.put("2",null);
        m.put("4",null);
        m.put(null,"Disha");
        m.put("5","esha");

        System.out.println(m);

        //iterate using java 8 lambda
        m.forEach((k,v)-> System.out.println(" key " + k +" value " +v));

        System.out.println(m.size());

        if(m.isEmpty()){
            System.out.println(" It is empty");
        }else {
            System.out.println(" Not Empty");

        }

        System.out.println("-------------------------------");
        HashMap<Integer , String> map=new HashMap<>();
        map.put(12,"Disha");
        map.put(20,"Jake");
        map.put(31,"Percy");
        map.put(40,"Lake");

        Iterator<Integer> iterator=map.keySet().iterator();
        System.out.println("Before sorting");
        while (iterator.hasNext()){
            int key=iterator.next();
            System.out.println(" Key  " +key +"  " +map.get(key));
        }

        System.out.println("\n");
        System.out.println("----------------------------------------");
//      Map<Integer , String> map1=new HashMap<>();

        System.out.println(" After Sorting ");
        // Sort hashmap by keys
        TreeMap<Integer,String> tm=new TreeMap<>(map);
        Iterator<Integer> iterator1=tm.keySet().iterator();
        while (iterator1.hasNext()){
            int key=iterator1.next();
            System.out.println(" Key " +key +"  " +map.get(key));
        }

        //sort hashmap by values
      Map<String , Integer> mp=new HashMap<>();
      mp.put("A",3);
      mp.put("B",2);
      mp.put("C",1);

      System.out.println(" Before Sorting ");
      System.out.println(mp);

      LinkedHashMap<String , Integer> sortedMap = mp.entrySet().stream().sorted((e1,e2) ->
      {
          return e1.getValue() - e2.getValue();
      }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1 , e2) ->
              e1, LinkedHashMap::new));

        System.out.println("After sorting");
        System.out.println(sortedMap);










    }
}
