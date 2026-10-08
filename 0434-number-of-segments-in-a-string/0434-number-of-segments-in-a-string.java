class Solution {
    public int countSegments(String s) {
        boolean found=false;
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' ' && !found){
                count++;
                found=true;
            }
            else if(ch[i]==' '){
                found=false;
            }
        }
        return count;
    }
}