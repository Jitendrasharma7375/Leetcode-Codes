class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int hash[]=new int[255];
        for(int i=0;i<s.length();i++){
            int len=0;
            Arrays.fill(hash,0);
            for(int j=i;j<s.length();j++){
                int pos=s.charAt(j);
                if(hash[pos]==1)break;
                len=j-i+1;
                maxLen=Math.max(len,maxLen);
                hash[pos]=1;
            }
        }
        return maxLen;
    }
}