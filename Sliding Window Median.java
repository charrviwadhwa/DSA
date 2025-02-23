class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int p = 0;
        double[] sol = new double[len - k + 1];
        boolean flag = (k % 2 == 0);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < k - 1; j++){
             list.add(nums[j]);
        }
        Collections.sort(list);

        for (int i = k - 1; i < len; i++) {
            int expectedindex = Collections.binarySearch(list, nums[i]);

            if (expectedindex > -1) {
                list.add(expectedindex + 1, nums[i]); 
            } 
            else {
                list.add(Math.abs(expectedindex + 1), nums[i]); 
            }

           
            if (flag) {
                sol[i - k + 1] = list.get((k / 2) - 1) / 2.0 + list.get((k / 2)) / 2.0;
            } else {
                sol[i - k + 1] = list.get((k / 2));
            }

            
            int index = Collections.binarySearch(list, nums[p]);
            list.remove(index);
            p++;
        }

        return sol;
    }
}
