import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*

abaabaabaa
ans = 7

2 per 3
10 / 3 = 3
3 * 2 = 6
10 mod 3 = 1

6 + 1 = 7 (total)

 */

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] s = fs.next().toCharArray();
			long n = fs.nextLong();
			long count = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i] == 'a') {
					count++;
				}
			}
			long length = s.length;
			long groups = n / length;
			long ans = count * groups;
			long remaining = n % length;
			for (int i = 0; i < remaining; i++) {
				if (s[i] == 'a') {
					ans++;
				}
			}
			out.println(ans);
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
