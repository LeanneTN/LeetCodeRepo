package elementary.array;

public class RotateArray {
    // method 1
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        for(int i = 0; i < len; i++){
            temp[(i+k)%len] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, len);
    }
}
