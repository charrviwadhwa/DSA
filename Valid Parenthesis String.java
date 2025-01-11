class Solution {
    public boolean checkValidString(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                close++;
            }
            else if(s.charAt(i)==')'){
                close--;
                open--;
            }
            else{
                close--;
                open++;
            }
            if(open<0){
                return false;
            }
            if(close<0){
                close=0;
            }
        }
        
        return close==0;
    }
}
