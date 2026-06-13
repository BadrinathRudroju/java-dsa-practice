package Searching;

import java.util.Arrays;

//time complexity is O(n**2)
//it's not a complete binary search since the array is not truly sorted
public class BSIn2DArrays {
    static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {17,29,37,49},
                {21,32,39,51},
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }

    public static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length -1;

        while(row < arr.length && col >= 0){

            if (arr[row][col] == target) {
                return new int[]{row , col};
            }else if( arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }


        return new int[]{-1,-1};
    }
}
