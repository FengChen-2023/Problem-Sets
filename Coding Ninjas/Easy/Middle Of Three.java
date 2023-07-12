import java.util.* ;
import java.io.*; 

public class Solution
{
	public static int middleOfThree( int x, int y, int z )
	{
		return IntStream.of( x, y, z ).sorted().skip( 1 ).findFirst().getAsInt();
	}
}
