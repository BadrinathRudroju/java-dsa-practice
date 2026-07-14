package sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
            int[] arr = {4,6,5,2,3};
            sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));;
    }

    static void sort(int[] arr, int low , int high){
        if(low > high){
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start <= end){
            while(pivot > arr[start]){
                start++;
            }
            while(pivot < arr[end]){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }
}
