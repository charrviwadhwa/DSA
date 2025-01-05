class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         ArrayList<Integer>l=new ArrayList();
          for(int j=0;j<nums1.length;j++){
                l.add(nums1[j]);
            }
          for(int j=0;j<nums2.length;j++){
                l.add(nums2[j]);
            }
        
        Collections.sort(l);
        if(l.size()%2==0){
            int index1=(l.size()/2)-1;
            int index2=(l.size()/2);
            double in=(double)(l.get(index1)+l.get(index2))/2;
            return in ;
        }
        else{
            int index=(l.size()+1)/2;
         return l.get(index-1);
        }
    }
}
