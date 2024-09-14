class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        

        for(int i=0;i<row;i++)
        {
            int j1=0;
            int j2=col-1;
            while(j1<j2)
            {
                int temp=matrix[i][j1];
                matrix[i][j1]=matrix[i][j2];
                matrix[i][j2]=temp;
                j1++;
                j2--;

            }
        }
        System.out.println(matrix);
    }
}
