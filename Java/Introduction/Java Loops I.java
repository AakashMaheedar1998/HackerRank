import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            int result=N*i;
            System.out.println(N+" "+"x"+" "+i+" "+"="+" "+result);
        }
    }
}