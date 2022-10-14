class Solution {
            int[] f = new int[50];
    public int climbStairs(int n) {


        if(n < 0) return 0;
        if(n <= 2) {
            return n;
        }
        
        if(f[n] != 0) return f[n];
       else{
          f[n] =  climbStairs(n-1) + climbStairs(n-2);
            return f[n];
        }
    }
}