import java.io.*;
import java.util.*;
class Program08_Mini_MaxSum
{
	public static long[] mini_MaxSum(int arr[])
	{
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }long result[]=new long[2];
		result[0]=sum-max;
		result[1]=sum-min;
		return result;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	long result[]=new long[2];
	result=mini_MaxSum(arr);
	for(int i=0;i<2;i++)
	System.out.print(result[i]+" ");
	}
}