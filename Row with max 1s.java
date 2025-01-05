class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int[]nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            nums[i]=c;
        }
        int max=0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}
