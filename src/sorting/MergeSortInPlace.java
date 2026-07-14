package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    static void main(String[] args) {
        int[] arr = {4,6,2,3,1,7,2,1};
        Sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr,int s,int e){
        if(arr.length == 1 || s >= e){
            return;
        }
        int mid = s + (e - s)/2;
        Sort(arr,s,mid);
        Sort(arr, mid + 1, e);
        Merge(arr, s, mid, e);
    }

   static int[] Merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int first = low;
        int second = mid + 1;
        int k = 0;

        while(first <= mid && second <= high){
            if(arr[first] <= arr[second]){
                temp[k] = arr[first];
                first++;
            }else{
                temp[k] = arr[second];
                second++;
            }
            k++;
        }

        while(first <= mid){
            temp[k] = arr[first];
            first++;
            k++;
        }

        while(second <= high){
            temp[k] = arr[second];
            second++;
            k++;
        }

        for(int i=0; i<temp.length; i++){
            arr[i + low] = temp[i];
        }
        return arr;
   }
}
