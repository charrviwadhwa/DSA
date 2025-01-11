class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        int count=0;
        ArrayList<Integer>l=new ArrayList();
        HashSet<Integer>set=new HashSet();
        for(int i=0;i<N;i++){
            if(!set.contains(pages[i])){
               if(l.size()==C){
                int pg=l.remove(0);
                set.remove(pg);
             } 
            set.add(pages[i]);
            l.add(pages[i]);
            count++;
            }
            else{
                l.remove(l.indexOf(pages[i]));
                l.add(pages[i]);
            }
            
            
        }
        return count;
    }
}
