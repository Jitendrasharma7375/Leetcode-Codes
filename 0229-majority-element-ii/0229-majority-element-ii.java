class Solution {
    public List<Integer> majorityElement(int[] v) {
        int n=v.length;
        int cnt1=0,cnt2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 && v[i]!=ele2)
            {
                cnt1=1;
                ele1=v[i];
            }else if(cnt2==0 && v[i]!=ele1){
                cnt2=1;
                ele2=v[i];
            }else if(ele1==v[i]) cnt1++;
            else if(ele2==v[i])cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == ele1) cnt1++;
            if (v[i] == ele2) cnt2++;
        }
        List<Integer>ls=new ArrayList<>();

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(ele1);
        if (cnt2 >= mini) ls.add(ele2);

        return ls;
    }
}