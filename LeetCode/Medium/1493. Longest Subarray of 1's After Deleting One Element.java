class Solution
{
    public int longestSubarray( int[] nums )
    {
        int ans = 0;
        int len = nums.length;
        int first = 0;
        int second = 0;

        for (int i = 0; i < len; i++ )
        {
            if ( nums[i] == 1 )
            {
                second++;
            }
            else
            {
                ans = Math.max( ans, first + second );
                first = second;
                second = 0;
            }
        }

        ans = Math.max( ans, first + second );

        return ans == len ? ans - 1 : ans;
    }
}
