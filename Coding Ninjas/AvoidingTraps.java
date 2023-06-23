import java.util.* ;
import java.io.*; 
class Solution {
	public static int avoidTraps(ArrayList<Integer> obstacles, int n) {
		// Write your code here.
		Collections.sort(obstacles);
		int last = obstacles.get(obstacles.size() - 1);

		outter:
		for (int i = 2; i < last; i++) {
			for (Integer obstacle : obstacles) {
				if (obstacle % i == 0) {
					continue outter;
				}
			}

			return i;
		}

		return last + 1;
	}
}
