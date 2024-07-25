class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        double l=Math.floor(n/3);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
           if(list.size()==0 || list.get(0)!=nums[i])
           {
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j])count++;
            }
            if(count>l)list.add(nums[i]);
           }
           if(list.size()==2) break;
        }
        return new ArrayList(list);
    }
}