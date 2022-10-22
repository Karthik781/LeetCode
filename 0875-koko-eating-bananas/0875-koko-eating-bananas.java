class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int l =1, r = 1000000000;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(time(piles, mid, h) ){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
        
    }
    
    public boolean time(int[] arr, int mid, int h  ){
        long ans =0;
        for(int i: arr ){
            int div = i/mid;
            ans += div;
            if(i % mid != 0 ) ans++;
        }
        return ans <= h;
    }
}