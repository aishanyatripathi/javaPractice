package arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr= {12,35,1,10,34,1,35};
        System.out.println(secLar(arr));
    }
    static int secLar(int[] arr){
        int n = arr.length;
        if (n<2) {
            return -1;
        }
        int first = arr[0];
        int second = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] > first) {
                second =first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second =i;
            }
        }
        if (second == arr[0]) {
            return -1;
        }
        else{
            return second;
        }
    }
}
