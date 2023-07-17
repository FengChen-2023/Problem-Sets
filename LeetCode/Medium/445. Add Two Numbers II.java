class Solution
{
    public ListNode addTwoNumbers( ListNode l1, ListNode l2 )
    {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        while ( l1 != null )
        {
            x.add( l1.val );
            l1 = l1.next;
        }

        while ( l2 != null )
        {
            y.add( l2.val );
            l2 = l2.next;
        }

        int m = x.size();
        int n = y.size();
        int o = 0;
        int p = 0;
        ListNode ans = null;
        
        for ( int i = 1; i <= Math.max( m, n ); i++ )
        {
            o = p;

            if ( i <= m )
            {
                o += x.get( m - i );
            }
            
            if ( i <= n )
            {
                o += y.get( n - i );
            }

            ans = new ListNode( o % 10, ans );
            p = o / 10;
        }

        if ( o >= 10 )
        {
            ans = new ListNode( p, ans );
        }

        return ans;
    }
}
