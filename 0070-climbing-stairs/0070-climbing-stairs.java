class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int prev = 2;
        int beforePrev = 1;
        int totalWays = 0;
        for(int i = 2; i < n; i++){
            totalWays = prev + beforePrev;
            beforePrev = prev;
            prev = totalWays;
        }
        return totalWays;
    }
}