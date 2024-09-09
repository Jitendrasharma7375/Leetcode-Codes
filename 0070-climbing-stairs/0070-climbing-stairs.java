class Solution {
    public int climbStairs(int n) {
        int prev1=0,prev2=1;
        for(int i=0;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}