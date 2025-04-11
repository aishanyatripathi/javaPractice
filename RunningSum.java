package arrays;
import java.util.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
        //System.out.println(runningSum(nums)); will print something like [I@6d06d69c, which isn't human-readable.
        //to print array nicely,use import java.util.Arrays and Arrays.toString
    }
    static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0]; //initialize the first element
        for(int i =1;i<nums.length;i++){  // start from i =1 bcoz we have assigned 0th index before this step
            runningSum[i] = runningSum[i - 1] + nums[i]; //runningSum[i] = nums[i] + nums[i-1]; not this line bcoz
            //This line causes an error when i == 0 because you're accessing nums[-1], which is out of bounds.
        }
        return runningSum;
    }
}
