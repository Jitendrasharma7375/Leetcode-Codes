import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int more=target-nums[i];
            if(map.containsKey(more))
            {
                return new int[]{map.get(more),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}