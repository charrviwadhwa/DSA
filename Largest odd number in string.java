class Solution {
    public String largestOddNumber(String num) {
        char a1=num.charAt(num.length()-1);
        int a=(int)a1;
        if(a%2!=0)
        {
            return num;
        }
        else
        {
            for(int i=num.length()-1;i>=0;i--)
            {
               
                int b=Integer.valueOf(num.charAt(i));
                if(b%2!=0)
                {
                    return num.substring(0,i+1);

                }
            }
        }
        return "";
        
    }
}
