import java.util.Arrays;

import static java.lang.System.*;

public class SumOfTwoIndices {

    public int[] sum(int[] nums, int target) {
        int arrayLength = nums.length;
        if (arrayLength < 2 || arrayLength > Math.pow(10, 4) || target < (-1 * (Math.pow(10, 9))) || target > Math.pow(10, 9)) {
            return null;
        } else {
            int[] output = new int[2];
            for (int i = 0; i < arrayLength; i++) {
                if(nums[i]<(-1*Math.pow(10,9))||nums[i]>Math.pow(10,9)){
                    return null;
                }
                for (int j = i + 1; j < arrayLength; j++) {
                    if(nums[j]<(-1*Math.pow(10,9))||nums[j]>Math.pow(10,9)){
                        return null;
                    }
                    if (nums[i] + nums[j] == target) {
                        output[0] = i;
                        output[1] = j;
                        return output;

                    }
                }
            }
        }
        return null;
    }

    public static void main(String args[]){

        SumOfTwoIndices ob = new SumOfTwoIndices();
        int []sample = {1,2,3,4,5,1000000000};
        System.out.println(Arrays.toString(ob.sum(sample,6)));

    }
}

