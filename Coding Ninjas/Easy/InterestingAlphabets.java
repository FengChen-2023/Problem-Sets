import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		// Write your code here.
		ArrayList<ArrayList<Character>> lists = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			lists.add(new ArrayList());
		}

		for (int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				lists.get(N - j).add((char) (64 + i));
			}
		}

		return lists;
	}
}
