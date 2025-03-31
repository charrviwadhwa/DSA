class Solution {
    public int[] secondGreaterElement(int[] arr) {
        int n=arr.length;
        int [] ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>st1=new Stack();// to trackk elements for which we have  to find 1st greater
        Stack<Integer>st2=new Stack();// to trackk elements for which we have  to find 2nd greater
        for(int i=0;i<n;i++){
            //what are elements for which arr[i] is 2nd greater 
            while(!st2.isEmpty() && arr[i]>arr[st2.peek()]){
                ans[st2.peek()]=arr[i];
                st2.pop();
            }
            Stack<Integer>temp=new Stack();
            while(!st1.isEmpty() && arr[i]>arr[st1.peek()]){
                temp.push(st1.peek());
                st1.pop();
            }
            while(!temp.isEmpty()){
                st2.push(temp.peek());
                temp.pop();
            }
            st1.push(i);
        }
        return ans;
    }
}
