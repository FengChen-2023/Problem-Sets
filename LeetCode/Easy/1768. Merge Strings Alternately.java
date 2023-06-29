class Solution
{
    public String mergeAlternately( String word1, String word2 )
    {
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        String s = "";

        while ( i < Math.min( m, n ) )
        {
            s += word1.charAt( i );
            s += word2.charAt( i++ );
        }

        while ( i < m ) {
            s += word1.charAt( i++ );
        }

        while ( i < n ) {
            s += word2.charAt( i++ );
        }

        return s;
    }
}
