class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int result[]=new int[2];
        result[0]=lowerBound(nums,n,target);
        if(result[0]==-1) return new int[]{-1,-1};
        result[1]=upperBound(nums,n,target);
        return result;
    }
    public int lowerBound(int []nums,int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
              if(nums[mid]==x){
                ans= mid;
                high=mid-1;
            }
            else if(nums[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return ans;
    }
    public int upperBound(int []nums,int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==x){
                ans= mid;
                low=mid+1;
            }
            else if(nums[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return ans;
    }
}