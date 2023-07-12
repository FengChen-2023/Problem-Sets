import java.util.* ;
import java.io.*; 

public class Solution
{
	public static int middleOfThree( int x, int y, int z )
	{
		if ( x > y )
		{
			if ( x > z )
			{
				return y > z ? y : z;
			}
			else
			{
				return x;
			}
		}
		else
		{
			if ( y > z )
			{
				return x > z ? x : z;
			}
			else
			{
				return y;
			}
		}
	}
}
