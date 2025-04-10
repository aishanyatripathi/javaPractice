package arrays;

import java.util.Arrays;

public class arrRev {
    public static void main(String[] args) {
        int[] arr = {2,21,45,65,48,12};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            //swap
            swap(arr , start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end] ;
        arr[end] = temp;
    }
}
