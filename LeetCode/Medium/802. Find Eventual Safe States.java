class Solution
{
    public List<Integer> eventualSafeNodes( int[][] graph )
    {
        int len = graph.length;
        ArrayDeque<Integer> safeNodes = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>> ins = new HashMap<>();
        int[] indegree = new int[graph.length];
        
        for ( int i = 0; i < len; i++ )
        {
            ins.put( i, new HashSet<>() );
        }

        for ( int i = 0; i < len; i++ )
        {
            indegree[i] = graph[i].length;

            if ( indegree[i] == 0 )
            {
                safeNodes.add( i );
            }
            else
            {
                for ( Integer j : graph[i] )
                {
                    ins.get( j ).add( i );
                }
            }
        }

        while ( !safeNodes.isEmpty() )
        {
            Integer safe = safeNodes.poll();
            ans.add( safe );

            for ( var i : ins.get( safe ) )
            {
                indegree[i]--;

                if ( indegree[i] == 0 )
                {
                    safeNodes.add( i );
                }
            }
        }
        
        Collections.sort( ans );

        return ans;
    }
}
