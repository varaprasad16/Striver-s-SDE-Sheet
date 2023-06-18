//Repeat and Missing Number Array
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] a=new int[2];
        if(n==0)
        {
            a[0]=0;
            a[1]=0;
            return a;
        }
        
        long actsum=(n*(n+1))/2;
        long actsqrsum=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++)
       {
            actsum-=arr.get(i);
            actsqrsum=actsqrsum-arr.get(i)*arr.get(i);
       }
        a[0]=(int)((actsqrsum)/(actsum)+(actsum))/2;
        a[1]=(int)((actsqrsum)/(actsum)-a[0]);
        return a;
    }
}\

