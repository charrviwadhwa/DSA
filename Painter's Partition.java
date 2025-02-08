import java.util.ArrayList;

public class Solution 
{
    public static int count(ArrayList<Integer> boards,int time){
        int cnt=1;
        int c=0;
        for(int i=0;i<boards.size();i++){
            if(boards.get(i)+c<=time){
                c+=boards.get(i);
            }
            else{
                cnt++;
                c=boards.get(i);
            }
        }
        return cnt;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low=0;
        int high=0;
        for(int i=0;i<boards.size();i++){
            low=Math.max(low,boards.get(i));
            high+=boards.get(i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int painters=count(boards,mid);
            if(painters>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
}
