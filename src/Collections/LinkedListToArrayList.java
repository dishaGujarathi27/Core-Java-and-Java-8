package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C");

        List<String> list=new ArrayList<>(linkedList);
        for(String s:list){
            System.out.println(s);
        }

    }
}
