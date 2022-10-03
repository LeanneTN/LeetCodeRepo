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

    // method 2
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
