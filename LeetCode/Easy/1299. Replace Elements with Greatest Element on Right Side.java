class Solution
{
    public int[] replaceElements( int[] arr )
    {
        int i = arr.length - 1;
        int max = arr[i];
        arr[i--] = -1;
        
        while ( i >= 0 )
        {
            int temp = max;
            max = Math.max( arr[i], max );
            arr[i--] = temp;
        }
        
        return arr;
    }
}
