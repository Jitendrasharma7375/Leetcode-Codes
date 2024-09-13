class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numCount(nums,goal)-numCount(nums,goal-1);
    }
    public int numCount(int []nums,int goal){
        int count=0;
        int l=0,r=0,n=nums.length;
        int sum=0;
        if(goal<0) return 0;
        while(r<n){
            sum=sum+nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}