

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashMap<Integer,Integer>mp=new HashMap();
        
        ArrayList<Integer> l=new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr1[i]))
            {
                continue;
            }
            mp.put(arr1[i],1);
        }
        
        for(int i=0;i<m;i++)
        {
            if(mp.containsKey(arr2[i]))
            {
                continue;
            }
            mp.put(arr2[i],1);
        }
        
        for(int val:mp.keySet())
        {
            l.add(val);
        }
        Collections.sort(l);
        return l;
    }
}

