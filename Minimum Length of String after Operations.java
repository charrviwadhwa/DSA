class Solution {
    public int minimumLength(String s) {
        int len=0;
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int val:freq){
            if(val!=0){
                if(val%2==0){
                    len+=2;
                }
                else{
                    len+=1;
                }
            }
        }
        return len;
    }
}
