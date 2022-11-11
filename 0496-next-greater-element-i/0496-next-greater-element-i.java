class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> dq = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = nums2.length - 1; i >= 0; i--){
            if(dq.isEmpty()){
                map.put(nums2[i] , -1);
                dq.push(nums2[i]);
            }else if(nums2[i] < dq.peek()){
                map.put(nums2[i], dq.peek());
                dq.push(nums2[i]);                
            }else{
                while(!dq.isEmpty() && nums2[i] > dq.peek()){
                    dq.pop();
                }
                if(dq.isEmpty()){
                    map.put(nums2[i] , -1);
                }else{
                    map.put(nums2[i], dq.peek());
                }
                dq.push(nums2[i]);
            }
        }
        
        int[] res = new int[nums1.length];
        int k = 0;
        for(int i : nums1){
            res[k++] = map.get(i);
        }
        return res;
    }
}