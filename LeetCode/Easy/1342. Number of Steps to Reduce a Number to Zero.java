class Solution
{
    public int numberOfSteps( int num )
    {
        if ( num < 3 )
        {
            return num;
        }

        return 1 + numberOfSteps( num % 2 == 0 ? num / 2 : num - 1 );
    }
}
