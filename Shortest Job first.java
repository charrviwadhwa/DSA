class Solution {
    static int solve(int bt[] ) {
    // code here
    int wait=0;
    int total=0;
    int n=bt.length;
    Arrays.sort(bt);
    for(int i=0;i<n;i++){
        wait+=total;
        total+=bt[i];
    }
    return wait/n;
  }
}
