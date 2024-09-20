class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        String str="";
        for (int i=0;i<arr.length;i++)
        {
            long n=Long.valueOf(arr[i]);  
            long sum=0;
		   long place_value=1;
		   while(n>0)
		 {
			long a=n%2;
			sum=sum+a*place_value;
			place_value*=10;
			n=n/2;	
		}
       
        String str1=String.valueOf(sum);
      
        str=str+str1+"-";

        }
        

        
       
        return str.substring(0,str.length()-1);

    }
}
