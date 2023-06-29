class Solution
{
    public int removeElement( int[] nums, int val )
    {
        int len = nums.length;
        int vals = 0;
        int v = len - 1;
        
        for ( int i = v; i >= 0; i-- )
        {
            if ( nums[i] == val )
            {
                v = i;
                vals++;
            }
        }
        
        int i = v + 1;
        while ( i < len )
        {
            if ( nums[i] == val )
            {
                i++;
            }
            else
            {
                nums[v++] = nums[i++];
            }
        }
        
        return len - vals;
    }
}
