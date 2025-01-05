class Solution {
    int median(int mat[][]) {
        // code here
        ArrayList<Integer>l=new ArrayList();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                l.add(mat[i][j]);
            }
        }
        Collections.sort(l);
        int index=(l.size()+1)/2;
        return l.get(index-1);
    }
}
