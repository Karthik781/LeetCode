class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0], slow = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(fast == slow) break;
        }while(true);
            
        int slow2 = nums[0];
        while (slow2 != slow) {
            slow2 = nums[slow2];
            slow = nums[slow];
            if (slow2 == slow) return slow;
        }
        return slow;
        
    }
}