import java.io.*;
import java.util.*;
class Program18_BetweenTwoSets
{
	private static int findGCD(int a, int b) 
	{
		return b == 0 ? a : findGCD(b, a % b);
	}

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int gcd = 0;

		int arr1[] = new int[n];
		int arr2[] = new int[m];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int lcm = arr1[0];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
			gcd = findGCD(arr2[i], gcd);
		}
		for (int i = 0; i < n - 1; i++) {
			lcm = (lcm * arr1[i + 1]) / findGCD(arr1[i + 1], lcm);
		}
		int count = 0, t = 0;
		for (int i = 1; i <= gcd && t <= gcd; i++) {
			t = lcm * i;
			if (gcd % (t) == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}



}