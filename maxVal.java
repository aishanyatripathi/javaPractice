package arrays;

public class maxVal {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
    }

    static int max(int[] arr){

        if (arr.length == 0) {
            return -1;
        }
        
        int maxVal = arr[0];   //if we considering if element can be 0 then take Interger.MIN_VALUE
        for (int i = 0; i < arr.length; i++){
            if( arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
