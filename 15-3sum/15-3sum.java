class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
         List<List<Integer>> res = new ArrayList<List<Integer> >(); 
        for(int i = 0; i < nums.length-2; i++){
            int l = i + 1;
            int r = nums.length-1;
            
              if(i > 0 && nums[i] == nums[i-1]){
                    continue;
                }
            while(l<r){
                
                if(nums[i]+nums[l]+nums[r] > 0){
                    r--;
                }else if(nums[i]+nums[l]+nums[r] < 0)  {
                    l++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(Integer.valueOf(nums[i]));
                    list.add(Integer.valueOf(nums[l]));
                    list.add(Integer.valueOf(nums[r]));

                    res.add(list);
                    
                    l++;
                    while(nums[l]==nums[l-1] && l < r )
                        l++;
                    while(nums[r]==nums[r-1] && r > l)
                        r--;
                    
                }
              
            }
            
        }
        return res;
        
    }
}