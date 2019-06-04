import java.io.*;
import java.util.*;

public class Solution {
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length()+B.length();
        System.out.println(len);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String res1=Character.toUpperCase(A.charAt(0))+A.substring(1);
        String res2=Character.toUpperCase(B.charAt(0))+B.substring(1);
        System.out.print(res1+" "+res2);
        
    }
}



