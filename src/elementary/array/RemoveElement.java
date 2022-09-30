package elementary.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int p = 0 , q = 0;
        if (nums.length == 0)
            return 0;
        while(q < nums.length){
            if(nums[q]!=val){
                nums[p] = nums[q];
                q++;
                p++;
            }else{
                q++;
            }
        }
        return p;
    }
}
