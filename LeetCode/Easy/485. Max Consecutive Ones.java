class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int max = 0;
        int len = nums.length;
        
        for ( int i = 0; i < len; i++ )
        {
            if ( nums[i] == 1 )
            {
                int j = i + 1;
                
                while ( j < len && nums[j] == 1)
                {
                    j++;
                }
                
                max = Math.max( max, j - i );
                i = j;
            }
        }
        
        return max;
    }
}
