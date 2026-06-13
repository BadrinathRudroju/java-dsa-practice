package sorting;

import java.util.Arrays;

public class insertionSort {
    static void main(String[] args) {
        int[] arr = {2,4,1,3,8,5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<=n-1; i++){
           int j=i;
           while(j>0 && arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
        return arr;
    }
}
