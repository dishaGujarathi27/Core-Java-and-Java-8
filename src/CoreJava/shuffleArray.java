package CoreJava;

import java.util.Arrays;
import java.util.Random;

public class shuffleArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        Random random=new Random();
        for(int i=0;i< arr.length;i++){
            int randomIndexSwap=random.nextInt(arr.length);
            int temp=arr[randomIndexSwap];
            arr[randomIndexSwap]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
