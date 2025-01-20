class Solution {
    public void helper(int i,int[]arr,List<Integer>l1,List<List<Integer>>l){
        if(i==arr.length){
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(arr[i]);
        helper(i+1,arr,l1,l);
        l1.remove(l1.size()-1);
        helper(i+1,arr,l1,l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList();
        List<Integer>l1=new ArrayList();
        helper(0,nums,l1,l);
        return l;
    }
}