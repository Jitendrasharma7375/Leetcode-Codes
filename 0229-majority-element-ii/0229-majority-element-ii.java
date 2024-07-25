class Solution {
    public List<Integer> majorityElement(int[] v) {
        int n=v.length;
        int mini=(int)(n/3)+1;
        List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> mpp=new HashMap<>();
       for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }

        return ls;
    }
}