class Solution {
    public String convertToBase7(int num) {
        int rem,copynum=num;
        String res = "";
        num=(int)Math.abs(num);
        if(num==0)
        {
            return "0";
        }
        while(num!=0)
        {
           rem=num%7;
           res=rem+res;
           num=num/7;    
        }
        if(copynum<0){
        return "-"+res;
        }
        return res;
    }
}