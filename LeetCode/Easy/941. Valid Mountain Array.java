class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        
        if ( len < 3 )
        {
            return false;
        }
        
        int prev = arr[0];
        int i = 1;
        
        while ( i < len && arr[i] > prev )
        {
            prev = arr[i++];
        }
        
        if ( i == 1 || i == len )
        {
            return false;
        }
            
        while ( i < len && arr[i] < prev )
        {
            prev = arr[i++];
        }
        
        return i == len;
    }
}
