package sorting;

//It uses extra space creating multiple objects at each recursion call
import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = {2,3,5,1,6,4};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] res = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;
        while( i<first.length && j<second.length){
            if(first[i] < second[j]){
                res[k] = first[i];
                i++;
            }else{
                res[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            res[k] = first[i];
            k++;
            i++;
        }

        while(j < second.length){
            res[k] = second[j];
            k++;
            j++;
        }

        return res;
    }
}
