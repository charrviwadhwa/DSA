class Solution {
    public int minChanges(String s) {
        int c=0;
        for(int i=1;i<s.length()/2;i++)
        {
            if(i%2!=0){
                if(s.charAt(i)!=s.charAt(i-1))
            {
                c++;
            }
            }
            
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(i%2!=0)
            {
                if(s.charAt(i)!=s.charAt(i-1))
            {
                c++;
            }
            }
            
        }
        return c;
    }
}
