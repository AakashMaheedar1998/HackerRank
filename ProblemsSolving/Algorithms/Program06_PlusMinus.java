import java.io.*;
import java.util.*;
class Program06_PlusMinus
{
	public static float[] PlusMinus(int arr[],int count)
	{
		float result[]=new float[3];
		int Pcount,Ncount,Zcount,i,j;
		Pcount=Ncount=Zcount=0;
		for(i=0;i<count;i++)
		{
			if(arr[i]>0)
				Pcount++;
			else if(arr[i]<0)
				Ncount++;
			else
				Zcount++;
			
		}
		float f1,f2,f3;
		f1=f2=f3=0;
		
		f1=(float)Pcount/count;
		f2=(float)Ncount/count;
		f3=(float)Zcount/count;
		result[0]=f1;result[1]=f2;result[2]=f3;
		return result;
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		float result[]=new float[3];
		result=PlusMinus(arr,count);
		for(int i=0;i<3;i++)
		{
			System.out.printf("%.6f %n",result[i]);
			
		}
	}
}
