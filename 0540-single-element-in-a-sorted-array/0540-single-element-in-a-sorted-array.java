class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]) result=nums[i];
            }else if(i==nums.length-1){
                if(nums[i]!=nums[i-1])result=nums[i];
            }else {
                if(nums[i-1]!=nums[i]&& nums[i]!=nums[i+1])result=nums[i];
            }
        }
        return result;
    }
}