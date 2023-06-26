import java.io.*;
import java.util.* ;

import java.util.ArrayList;
import java.util.stream.*;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        Integer min = arr.size() / 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( Integer i : arr )
        {
            if ( i >= min )
            {
                map.put( i, map.getOrDefault( i, 0) + 1 );
            }
        }

        return map.entrySet().stream().filter( (entry) -> entry.getValue() > min ).map( Map.Entry::getKey ).collect( Collectors.toCollection( ArrayList::new ) );
    }
}
