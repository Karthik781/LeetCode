class Solution {
    public int maxArea(int[] height) {
        
        int max = -1;
        int left = 0,  right = height.length -1;
        
        while(left < right){
            int h = Math.min(height[left], height[right]);
            
            max = Math.max(max, h * (right - left));
            
            if(height[left] > height[right]) right--;
            else left++;
        }
        return max;
        
    }
}