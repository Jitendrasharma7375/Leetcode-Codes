class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0,rSum=0,totalSum=0;
        int left=0,right=cardPoints.length-1;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        totalSum=lSum;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[right];
            totalSum=Math.max(totalSum,lSum+rSum);
            right--;
        }
        return totalSum;
    }
}