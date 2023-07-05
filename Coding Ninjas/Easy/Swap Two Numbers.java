import java.util.* ;
import java.io.*; 
import javafx.util.Pair;

public class Solution
{
    public static Pair < Integer, Integer > swap( Pair < Integer, Integer > swapValues )
    {
        return new Pair<>( swapValues.getValue(), swapValues.getKey() );
    }
}
