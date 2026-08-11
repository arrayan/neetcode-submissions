class Solution {
    public int climbStairs(int n) {
        //Use recursion I think
        // n = 3, n = 1+1+1 , N = 2+ 1, n = 1+2
        int steps = 0;
        if((n == 1) || (n == 2)){
            return n;
        }
        else{
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
