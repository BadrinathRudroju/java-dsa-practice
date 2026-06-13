package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {5,1,6,4};
        System.out.println(Arrays.toString(Sort(arr)));
    }
    public static int[] Sort(int[] arr){
        int n = arr.length;

        for(int i=n-1; i>= 0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
