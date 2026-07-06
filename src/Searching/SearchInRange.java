package Searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchInRange {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        }catch(InputMismatchException e){
            System.out.println("Recheck data type");
            scanner.close();
            return;
        }
        System.out.print("Element to found: ");
        int target = scanner.nextInt();
        System.out.println("Enter range: ");
        System.out.print("Start: ");
        int start = scanner.nextInt();
        System.out.print("End: ");
        int end = scanner.nextInt();

        System.out.println(searchinrange(arr,target,start,end));
    }

    static String searchinrange(int[] arr, int target, int start, int end){
        if(arr.length == 0 || start<0 || end>arr.length || start>end ){
            return "Does not exist";
        }
        for(int i=start; i<= end; i++){
            if(arr[i] == target){
                return "At index: " + i;
            }
        }
        return "Element not found";
    }
}