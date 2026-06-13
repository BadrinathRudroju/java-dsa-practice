package sorting;

import java.util.Arrays;

//it finds the min in the array the places it in the first position of the array
//then the first position element gets into the place of the previous min element
//position
//Ex: arr = {2,4,1,3,8,5}
//after the first step array becomes
// arr= {1,4,2,3,8,5}
//it just swapped the position of the  minimum element to the first element
//next it ignores first element cause it is already sorted then  goes on the next
// steps which are
//  1,2,4,3,8,5
//  1,2,3,4,8,5
//  1,2,3,4,5,8
//at the it just selects the minimum elements and fixes in the first position of the
//unsorted part of the array
public class selectionSort {
    static void main() {
        int[] arr = {2,4,1,3,8,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
