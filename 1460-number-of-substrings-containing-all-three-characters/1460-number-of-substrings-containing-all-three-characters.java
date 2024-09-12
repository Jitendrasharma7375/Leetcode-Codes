import java.util.*;
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int lastSeen[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            lastSeen[(s.charAt(i)-'a')]=i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                int min=Math.min(lastSeen[0],lastSeen[1]);
                min=Math.min(min,lastSeen[2]);
                count=count+(1+min);
            }
        }
        return count;
    }
}