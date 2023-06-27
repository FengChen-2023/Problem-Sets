class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int o = 0;
        String ss = "";

        if ( m > n )
        {
            o = n;
            ss = str2;
        }
        else
        {
            o = m;
            ss = str1;
        }
        
        outter:
        for ( int i = o; i > 0; i-- )
        {
            if ( m % i != 0 || n % i != 0 )
            {
                continue;
            }

            String s = ss.substring( 0, i );
            for ( int j = 0; j < m / i; j++ )
            {
                if ( !str1.substring( j * i, ( j + 1 ) * i ).equals( s ) )
                {
                    continue outter;
                }
            }
            for ( int j = 0; j < n / i; j++ )
            {
                if ( !str2.substring( j * i, ( j + 1 ) * i ).equals( s ) )
                {
                    continue outter;
                }
            }

            return s;
        }

        return "";
    }
}
