package array;

import java.util.Arrays;

public class Merge {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = nums1[i];
        }
        int p = 0, q = 0, count = 0;
        while(p < m && q < n){
            if(arr[p] <= nums2[q]){
                nums1[count++] = arr[p++];
            }else if(arr[p] > nums2[q]){
                nums1[count++] = nums2[q++];
            }
        }
        if(p < m){
            for(int i = p; i < m; i++){
                nums1[count++] = arr[i];
            }
        }else if(q < n){
            for(int i = q; i < n; i++){
                nums1[count++] = nums2[i];
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < m + n; i++){
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
