package CoreJava;

import java.util.Arrays;

//Rotate array by k times
public class RotateArray {
    static void main(String[] args) {
        int k = 2;
        int[] arr = {1,2,3,4,5,6};
        Reverse(arr,0, arr.length - 1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr, int s, int e){
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
