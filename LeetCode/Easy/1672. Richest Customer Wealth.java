class Solution
{
    public int maximumWealth( int[][] accounts )
    {
        int max = 0;

        for ( int[] account : accounts)
        {
            int sum = IntStream.of( account ).sum();
            max = sum > max ? sum : max;
        }

        return max;
    }
}
