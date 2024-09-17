class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>l=new ArrayList();
        int row=arr.length;
        int col=arr[0].length;
        int left=0;
        int top=0;
        int bottom=row-1;
        int right=col-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                l.add(arr[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                l.add(arr[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
            {
                l.add(arr[bottom][i]);
            }
            bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    l.add(arr[i][left]);
                }
                left++;
            }
            
        }
        return l;
    }
}
