import java.io.*;
import java.util.*;
class Program17_Kangaroo
{
    public static String Kangroo(int x1,int v1,int x2,int v2)
    {
        if( x2>x1 && v2>=v1) return "NO";
        if( x1>x2 && v1>=v2) return "NO";
        
        int result = (x1-x2) % (v2-v1);
        if( result == 0){
        return "YES";
        }
    return "NO";

    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int v1=scan.nextInt();
        int x2=scan.nextInt();
        int v2=scan.nextInt();
        String result=Kangroo(x1,v1,x2,v2);
        System.out.println(result);
    }
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program17_Kangaroo
5 3 0 2
NO

D:\GitHub\HackerRank\ProblemSolving>java Program17_Kangaroo
0 3 4 2
YES

D:\GitHub\HackerRank\ProblemSolving>java Program17_Kangaroo
2 1 1 2
YES
*/