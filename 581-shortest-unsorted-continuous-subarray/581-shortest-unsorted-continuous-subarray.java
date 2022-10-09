class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int l = 0, r = nums.length - 1;
        
        while(l < len - 1 && nums[l] <= nums[l + 1]) l++;
        
        if(l == len - 1)   return 0;
        
        while(r > 0 && nums[r] >= nums[r-1]) r--;
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = l; i <= r; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        
        while(l > 0 && min < nums[l-1]) l--;
        while(r < len -1 && max > nums[r+1] ) r++;
        
        return r - l + 1;
        
    }
}