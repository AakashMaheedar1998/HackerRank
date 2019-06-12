import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int twoStacks(int x, int[] a, int[] b)
    {
        int sum=0,count=0,temp=0,i=0,j=0;  
        int n=a.length;
        int m=b.length;
   while(i<n && sum+a[i]<=x){    //considering only first stack and calculating count
            sum+=a[i];
            i++;
        }
        count=i;        
       
        while(j<m && i>=0){          //now adding one element of second stack at a time and subtracting the top element of first stack and calculating the count   
            sum+=b[j];             
            j++;
            while(sum>x && i>0){
                i--;
                sum-=a[i];
            }
            if(sum<=x && i+j>count)
                count=i+j;
        }
        return count;
    } 
 
     

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
