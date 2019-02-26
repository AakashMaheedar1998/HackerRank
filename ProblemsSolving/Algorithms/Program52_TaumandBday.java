import java.io.*;
import java.util.*;
class Program52_TaumandBday
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int cost=0;
		for(int i=0;i<count;i++)
		{
			int b=scan.nextInt();
			int w=scan.nextInt();
			int bc=scan.nextInt();
			int wc=scan.nextInt();
			int z=scan.nextInt();
			
			//case1
			if(bc==wc || (z > bc && z > wc))
			{
				cost=(b*bc)+(w*wc);
			}
			else if(bc<wc && (z+bc)>wc)
			{
				cost=(b*bc)+(w*wc);
			}
			else if(wc<bc && (z+wc)>bc)
			{
				cost=(b*bc)+(w*wc);
			}
			
			else if(bc>wc && bc < (b*w)+z)
			{
				cost=((b+w)*wc)+(b*z);
				
			}
			else if(wc>bc && wc<(b*w)+z)
			{
				cost=((b+w)*bc)+(w*z);
			}
			
			System.out.println(cost);
			cost=0;
		}
	}
}


/*

IP:
10
384 887
2778 6916 7794
336 387
493 6650 1422
363 28
8691 60 7764
927 541
3427 9173 5737
212 369
2568 6430 5783
531 863
5124 4068 3136
930 803
4023 3059 3070
168 394
8457 5012 8043
230 374
4422 4920 3785
538 199
4325 8316 4371
OP:
7201244
906753
2841792
8134553
2917086
6231528
6197767
3395504
2857140
3981734
*/