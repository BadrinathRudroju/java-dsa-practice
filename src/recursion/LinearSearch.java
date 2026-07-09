package recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
  public static void main(String[] args){
      int[] arr  = {1,23,4,5,5,6};
      list(arr,5,0);
      System.out.println(indexList);
  }

  static int search(int[] arr, int target, int index){
      if(index == arr.length){
          return -1;
      }
      if(arr[index] == target){
          return index;
      }else {
          return search(arr, target, index + 1);
      }
  }
  static  List<Integer> indexList = new ArrayList<>();
  static void list(int[] arr,int target,int index){
      if(index == arr.length){
          return;
      }

      if(arr[index] == target){
          indexList.add(index);
      }
      list(arr,target,index+1);
  }
}
