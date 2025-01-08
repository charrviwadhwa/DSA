class Solution {
    public boolean PrefixSuffixPairs(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
    public int countPrefixSuffixPairs(String[] arr) {
       int count=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(PrefixSuffixPairs(arr[i],arr[j])){
            count++;
        }
        }
       }
       return count;

    }
}
