class Solution {
    public int trap(int[] height) {
        int  l = 0, r = height.length - 1, water = 0;
        int maxL = 0, maxR = 0;
        
        while(l < r){
            if(height[l] < height[r]){
                if(height[l] > maxL) maxL = height[l];
                int loc = maxL - height[l];
                if(loc > 0) water += loc;
                
                l++;
            }else{
                if(height[r] > maxR) maxR = height[r];
                int loc = maxR - height[r];
                if(loc > 0) water += loc;
                
                r--;
            }
            
        }
        return water;
    }
}