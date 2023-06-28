boolean solution( String inputString )
{
    int len = inputString.length();
    int last = len - 1;
    
    for ( int i = 0; i < len / 2; i++ )
    {
        if ( inputString.charAt( i ) != inputString.charAt( last-- ) )
        {
            return false;
        }
    }
    
    return true;
}
