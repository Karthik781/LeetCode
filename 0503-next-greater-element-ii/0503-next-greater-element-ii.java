class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // if(nums == null) return;
        
        Deque<Integer> dq = new LinkedList<>();
        int len = nums.length ;
        int[] res = new int[len];
        
        for(int i = 0; i < len * 2; i++){
            int num = nums[i%len];
            
            while(!dq.isEmpty() && num > nums[dq.peek()]){
                int x = dq.pop();
                res[x] = num;
            }
            if(i < len) 
                dq.push(i);
        }
        while(!dq.isEmpty()){
            int x = dq.pop();
            res[x] = -1;
        }
        return res;
    }
}