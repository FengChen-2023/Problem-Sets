class Solution
{
	public ListNode addTwoNumbers( ListNode l1, ListNode l2 )
	{
		ArrayDeque<Integer> x = new ArrayDeque<>();
		ArrayDeque<Integer> y = new ArrayDeque<>();

		while ( l1 != null )
		{
			x.addFirst( l1.val );
			l1 = l1.next;
		}

		while ( l2 != null )
		{
			y.addFirst( l2.val );
			l2 = l2.next;
		}

		int z = 0;
		ListNode ans = null;

		while ( !( x.isEmpty() && y.isEmpty() )  || z > 0)
		{
			if ( !x.isEmpty() )
			{
				z += x.pop();
			}

			if ( !y.isEmpty() )
			{
				z += y.pop();
			}

			ans = new ListNode( z % 10, ans );
			z /= 10;
		}

		return ans;
	}
}
