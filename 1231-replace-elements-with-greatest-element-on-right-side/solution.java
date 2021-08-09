class Solution {
    public int[] replaceElements(int[] arr) {
            int maxi=-1;
            for(int i=arr.length-1; i>= 0; i--)
            {
                int curr = arr[i];
                arr[i] = maxi;
                if(curr > maxi) maxi = curr;
            }
           // arr[arr.length-1]=-1;
        
        
        return arr;
    }
    
   /* public int maxNum(int[] arr, int low,int high)
    {
        int maxi=arr[low];
        for(int i=low+1;i<=high;i++)
        {
          maxi= Math.max(maxi,arr[i]);
        }
        return maxi;
    }*/
}
