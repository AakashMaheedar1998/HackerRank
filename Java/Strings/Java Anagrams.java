import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean Anagrams=false;
        if(a.length()!=b.length())
            return false;
        a=a.toLowerCase();    
        b=b.toLowerCase();  
        char Aarr[]=a.toCharArray();
        
        
        for(Character c : Aarr)
        {
            int idx=b.indexOf(c);
            if(idx!=-1)
            {
                b=b.substring(0,idx)+b.substring(idx+1);
            }
            else
            {
                return false;
            }
        }
        return b.isEmpty();
    }

  public static void main(String[] args) {