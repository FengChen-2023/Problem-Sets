class Solution
{
    public boolean checkIfExist( int[] arr )
    {
        HashSet<Integer> set = new HashSet<>();
        
        for ( int num : arr )
        {
            if ( num == 0 )
            {
                if ( set.contains( num ) )
                {
                    return true;
                }
            }
            
            set.add( num );
        }
        
        set.remove( 0 );
        
        for ( int num : arr )
        {
            if ( set.contains( num * 2 ) )
            {
                return true;
            }
        }
        
        return false;
    }
}
