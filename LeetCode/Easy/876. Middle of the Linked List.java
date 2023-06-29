class Solution
{
    public ListNode middleNode( ListNode head )
    {
        ListNode curr = head;
        ListNode mid = head;

        while ( curr.next != null )
        {
            curr = curr.next;
            mid = mid.next;
            
            if ( curr.next != null )
            {
                curr = curr.next;
            }
        }

        return mid;
    }
}
