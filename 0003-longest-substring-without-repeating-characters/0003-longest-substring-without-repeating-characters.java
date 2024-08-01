class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int hash[]=new int[255];
        Arrays.fill(hash,-1);
        int n=s.length();
        int l=0,r=0;
        while(r<n){
            int len=0;
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l) {
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            maxLen=Math.max(len,maxLen);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
}