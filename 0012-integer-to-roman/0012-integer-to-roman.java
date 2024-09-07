class Solution {
    public String intToRoman(int num) {
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int index=0;
        StringBuilder res=new StringBuilder();
        while(num>0){
            if(num>=value[index]){
                res.append(symbol[index]);
                num-=value[index];
            }
            else {
                index++;
            }
        }
        return res.toString();
    }
}