package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] list={"Mumbai","Pune","Jalgaon","Rajasthan"};


        ArrayList<String> ar=new ArrayList<>(Arrays.asList(list));

        for (String s:ar){
            System.out.println(s);
        }

        Integer[] in={12,78,22,1,0};


        System.out.println("---------------------------------------");

        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(in));
        for (Integer s:arr){
            System.out.println(s);
        }
    }
}
