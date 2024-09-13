class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
       return numCount(nums,goal)-numCount(nums,goal-1);
    }
    public int numCount(int []nums,int goal){
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal){
                sum-=nums[l]%2;
                l+=1;
            }
            count=count+(r-l+1);
            r+=1;
        }
        return count;
    }
}