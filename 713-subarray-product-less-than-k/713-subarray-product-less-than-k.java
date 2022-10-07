class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int l = 0, prod = 1, count = 0;
        
        for(int r = 0; r < nums.length; r++){
            prod *= nums[r];
            
            while(prod >= k && l <= r ){
                prod /= nums[l++];
                
            }
            count = count + r - l + 1;
        }
        return count;
    }
}