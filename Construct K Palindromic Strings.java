class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k){
            return true;
        }
        if(s.length()<k){
            return false;
        }
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int count=0;
       for(int i=0;i<freq.length;i++){
        if(freq[i]%2!=0){ //odd count
            count++;
        }
       }
       return count<=k;

    }
}
