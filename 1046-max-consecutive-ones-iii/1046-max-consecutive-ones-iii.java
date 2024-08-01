class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int n=nums.length,l=0,r=0,zero=0;       
        while(r<n){
            int len=0;
            if(nums[r]==0)zero++;
            if(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        return maxLen;
    }
}