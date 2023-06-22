// Reverse Pairs
// Given an integer array nums, return the number of reverse pairs in the array.
// A reverse pair is a pair (i, j) where:
// 0 <= i < j < nums.length and
// nums[i] > 2 * nums[j].
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int cnt=0;
        int n=arr.size();
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(arr.get(i)>2*arr.get(j))
               cnt++; 
           }
       }
       return cnt;
    }
}
