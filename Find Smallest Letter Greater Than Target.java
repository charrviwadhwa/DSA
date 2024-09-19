class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a=target;
        int []arr=new int[letters.length];
        for(int i=0;i<arr.length;i++)
        {
            int b=letters[i];
            arr[i]=b;
        }
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=a)
            {
                low=mid+1;
            }
            else
            {
                ans=arr[mid];
                high=mid-1;
            }
        }
        char ch='a';//just taken any character
        if(ans==0)
        {
            ch=(char)arr[0];
        }
        else
        {
             ch=(char)ans;
        }
       

        return ch;

    }
}
