class Solution
{
    public void moveZeroes( int[] nums )
    {
        int len = nums.length;
        
        for ( int i = 0, j = 0; i < len; i++, j++ )
        {
            if ( nums[i] == 0 )
            {
                while ( j < len && nums[j] == 0 )
                {
                    j++;
                }
                
                if ( j < len )
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}
