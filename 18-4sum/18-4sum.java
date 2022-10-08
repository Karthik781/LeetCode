class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                search4sum(nums, target, i, j, res);
            }
        }
        return res;

    }

    private void search4sum(int[] nums, int target, int f , int s, List<List<Integer>> res){
            int l = s + 1, r = nums.length - 1;
            while(l < r){
                Long sum = (long)nums[f] + (long)nums[s] + (long)nums[l] + (long)nums[r];
            if(sum == target){
                res.add(Arrays.asList(nums[f], nums[s] ,nums[l], nums[r]));
                l++;
                r--;
                while(l < r && nums[l] == nums[l-1]) l++;
                while( l < r && nums[r] == nums[r+1]) r--;
            }else if(sum > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
}