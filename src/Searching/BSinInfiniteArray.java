package Searching;

public class BSinInfiniteArray {
     static void main(String[] args){
         int[] arr = {1,2,3,4,5,6,7,8};
         int target = 7;
         System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
         int start =0;
         int end = 1;

         if(target > end){
             int newstart = end + 1;
             end = end + (end - start + 1);
             start = newstart;
         }
         return search(arr,target,start,end);
    }

    static int search(int[] arr, int target, int start, int end){
         while(start <= end){
             int mid = start + (end - start)/2;

             if(target == arr[mid]){
                 return mid;
             }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                 end = mid -1;
             }
         }
         return -1;
    }
}
