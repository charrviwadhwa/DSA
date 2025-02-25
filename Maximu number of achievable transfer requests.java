class Solution {
    int max=0;
    public void f(int[][]arr,int i,int c,int[]tomove){

        if(i==arr.length){// taken decision for all requests
            boolean flag =true;
            for(int j=0;j<tomove.length;j++){
                if(tomove[j]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                max=Math.max(c,max);
            }
            return;
        }
        //take decisions for the remaining requests
        c++;
        int from=arr[i][0];
        int to=arr[i][1];
        //accept
        tomove[from]--;
        tomove[to]++;
        f(arr,i+1,c,tomove);

        //reject
        c--;
        tomove[from]++;
        tomove[to]--;
        f(arr,i+1,c,tomove);
      

    }
    public int maximumRequests(int n, int[][] requests) {
        int [] arr=new int[n];
        f(requests,0,0,arr);
        return max;

    }
}
