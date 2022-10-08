class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int left = 0,  right = height.length - 1;
        int h = 0;
        while(left < right){
            if(height[left] > h && height[right] > h){
                 h = Math.min(height[left], height[right]);
                 max = Math.max(max, h * (right - left));
            }
            
            if(height[left] > height[right] ) right--;
            else left++;
        }
        return max;
        
    }
}