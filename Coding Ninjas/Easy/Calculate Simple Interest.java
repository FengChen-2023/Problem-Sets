import java.util.*;
import java.io.*;

class Solution
{
	
	public static void main( String args[] )
	{
		Scanner sc = new Scanner( System.in );

		System.out.println( Math.round( Math.floor( sc.nextInt() * sc.nextFloat() * sc.nextInt() / 100 ) ) );
	}
}
