package elementary.array;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1] && nums[i - 1] != nums[i]){
                return nums[i];
            }
        }
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        return 0;
    }
}
