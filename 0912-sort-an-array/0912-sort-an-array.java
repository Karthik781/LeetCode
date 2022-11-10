class Solution {
    public int[] sortArray(int[] nums) {
        QS(nums, 0 , nums.length - 1);
        return nums;
    }
    
    private static void QS(int[] nums, int s, int e) {
        if(s>=e) return;
        int i = partition(nums, s, e);
        QS(nums, s, i );
        QS(nums, i + 1, e);
    }
    
    private static int partition(int[] nums, int l, int r){
        int pivot = nums[l];
        
        while(l < r){
            while( l < r && nums[r] >= pivot) r--;
            swap(nums, l, r);
            while( l < r && nums[l] <= pivot) l++;
            swap(nums, r, l);
           
        }
        nums[l] = pivot;
        return l;
    }
    
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}