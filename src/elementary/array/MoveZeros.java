package elementary.array;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if(nums == null)
            return;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; ++i){
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums){
        //use the idea of quick sort
        if(nums == null)
            return;
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
