int solution( int[] inputArray )
{
    int len = inputArray.length;
    int max = -2001;
    
    for ( int i = 1; i < len; i++ )
    {
        if ( max < inputArray[i - 1] * inputArray[i] )
        {
            max = inputArray[i - 1] * inputArray[i];
        }
    }
    
    return max;
}
