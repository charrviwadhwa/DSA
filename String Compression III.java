class Solution {
    public String compressedString(String word) {
        int l=word.length();
        String comp="";
        int c=1;
        for(int i=1;i<word.length();i++)
        {
            char s=word.charAt(i);
            int n=s;
            if(c<9 && s==word.charAt(i-1) )
            {
                c++;
            }
            else
            {
                String num=String.valueOf(c);
                comp+=num+word.charAt(i-1);
                c=1;
            }
        }
        String num=String.valueOf(c);
        comp+=num+word.charAt(l-1);
       
        return comp;
    }
}
