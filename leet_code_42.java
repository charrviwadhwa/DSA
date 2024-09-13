package Arrays;

import java.util.Scanner;

public class leet_code_42 {
	//TRAPPING RAIN WATER
	 public static int trap(int[] height) {
	        int n=height.length;
	        int sum =0;
	        int [] leftmax=new int[height.length];
	        int[] rightmax=new int[height.length];
	        int[] finalans=new int[height.length];
	        leftmax[0]=height[0];
	        rightmax[n-1]=height[n-1];
	        for(int i=1;i<n;i++)
	        {
	            leftmax[i]=Math.max(leftmax[i-1],height[i]);
	        }
	        for (int i=n-2;i>=0;i--)
	        {
	            rightmax[i]=Math.max(rightmax[i+1],height[i]);
	        }
	        for(int i=0;i<n;i++)
	        {
	            finalans[i]=(Math.min(rightmax[i],leftmax[i]))-height[i];
	            sum+=finalans[i];

	        }
	        return sum;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		int m=sc.nextInt();
		while(m>0) {
			int n=sc.nextInt();
			int []num=new int[n];
		for(int j=0;j<n;j++)
		{
			num[j]=sc.nextInt();
			
		}
		System.out.println(trap(num));
		m--;
		}
		
		
	
	
	}

}
