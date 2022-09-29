package array;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int flag = 0;
        for(; flag < nums.length; flag++){
            if(nums[flag] >= target)
                return flag;
        }
        return flag;
    }
}
