import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int hash[]=new int[26];
        int n=s.length();
        int maxLen=0;
        for(int i=0;i<n;i++){
            Arrays.fill(hash,0);
            int changes=0;
            int maxFreq=0;
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'A']++;
                maxFreq=Math.max(maxFreq,hash[s.charAt(j)-'A']);
                changes=(j-i+1)-maxFreq;
                if((changes<=k) && changes>=0){
                    maxLen=Math.max(maxLen,j-i+1);
                }else break;
            }
        }
        return maxLen;
    }
}