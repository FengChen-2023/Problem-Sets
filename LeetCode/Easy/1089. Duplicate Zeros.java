class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        
        for ( int i = 0; i < len - 1; i++ )
        {
            if ( arr[i] == 0 )
            {
                for ( int j = len - 1; j > i + 1; j-- )
                {
                    arr[j] = arr[j - 1];
                }
                
                arr[++i] = 0;
            }
        }
    }
}
