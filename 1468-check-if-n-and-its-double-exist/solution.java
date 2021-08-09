class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        
        Arrays.sort(arr);
        int zero = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == 0)
            {
                zero++;
                continue;
            }
            
            int target = arr[i]*2;
            if(bs(arr,0,n-1,target)) return true;
              
        }   
         if (zero > 1) return true;
         return false;
    }
    
        
        
        
        
        /*  
        // Using Map//
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
        
        for(int i=0; i<n; i++)
        {
            
            if(hash.containsValue(2 * arr[i]) || (arr[i]%2 == 0 && hash.containsValue(arr[i]/2)))
                return true;
            
            hash.put(i,arr[i]);
                
        }
        */
     /* 
     Linear search
     for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == j)
                 continue;
                else
                {
                    if(arr[i]== 2* arr[j])
                        return true;
                }
            }
        }
        */
       
    public boolean bs(int[] arr,int low,int high,int target)
    {
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
                return true;
            if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
        
    }
}
