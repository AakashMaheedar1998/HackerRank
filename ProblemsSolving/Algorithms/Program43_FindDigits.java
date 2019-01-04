import java.io.*;
import java.util.*;
class Program43_FindDigits
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
       long cloudarr[]=new long[count];
    for(int i=0;i<count;i++)
    {
        cloudarr[i]=scan.nextInt();
    }
       
        
        for(int j=0;j<count;j++)
        {
			 long number=0;
        long rnumber=0;
			long r=0;
        long evencount=0;
            number= cloudarr[j];
            rnumber=number;
            while(rnumber!=0)
            {
                r=rnumber%10;
                rnumber=(rnumber-r)/10;
				System.out.println(r);
                if(r!=0&&number%r==0)
                {
                        evencount++;
                }
                
            }
            System.out.println(evencount);
			
        }
    }
}
/*
11
123456789
114108089
110110015
121
33
44
55
66
77
88
106108048
op
3
3
6
2
2
2
2
2
2
2
5
*/