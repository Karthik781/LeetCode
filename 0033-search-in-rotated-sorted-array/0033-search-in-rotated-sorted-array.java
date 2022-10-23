class Solution {
    public int search(int[] nums, int target) {
        
        int len =  nums.length;
        int l = 0, r = len -1;
        while( l <= r){
            int mid = l + (r - l)/2;
            System.out.println(mid);
            if(nums[mid] == target) return mid;
            
            if(nums[mid] >= nums[l]){
                if(target > nums[mid] || target < nums[l]) l = mid + 1;
                else r = mid - 1;
            }else{
                if(target < nums[mid] || target > nums[r]) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}