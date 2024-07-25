class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        double l=Math.floor(n/3);
        Set<Integer> list=new HashSet<>();
        for(int i=0;i<n;i++){
            int count=0;
            int val=nums[i];
            for(int j=i;j<n;j++){
                if(val==nums[j]) count++;
            }
            if(count>l)
            {
                list.add(val); 
            }
        }
        return new ArrayList(list);
    }
}