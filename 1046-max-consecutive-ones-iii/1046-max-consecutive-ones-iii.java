class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            int zero=0,len=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    len=j-i+1;
                    maxLen=Math.max(len,maxLen);
                }else break;
            }
        }
        return maxLen;
    }
}