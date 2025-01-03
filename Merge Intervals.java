class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
       Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int[]>l=new ArrayList();
      
        for(int i=0;i<n;i++){
             if(l.isEmpty() || intervals[i][0]>l.get(l.size()-1)[1]){
                   l.add(new int[]{intervals[i][0],intervals[i][1]});
                }
           
             else {
                    int new_end=Math.max(l.get(l.size()-1)[1],intervals[i][1]);
                    l.get(l.size()-1)[1]=new_end;
                }
               
           
        }
        return l.toArray(new int[l.size()][]);
    }
}