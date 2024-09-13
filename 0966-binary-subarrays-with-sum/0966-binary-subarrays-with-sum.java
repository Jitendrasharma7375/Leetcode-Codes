class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0,n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==goal) count++;
                if(sum>goal) break;
            }
            sum=0;
        }
        return count; 
    }
}