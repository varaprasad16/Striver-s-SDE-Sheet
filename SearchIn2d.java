/*Search a 2D Matrix
You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.*/
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        // int m=a.length;
        // int n=a[0].length;
        // int low=0,high=m-1;
        // while(low<=high)
        // {
        //     int mid=low+(high-low)/2;
        //     if(target>a[mid][n-1])
        //     {
        //        low=mid+1;
        //     }
        //     else if(target<a[mid][n-1])
        //     {
        //        high=mid-1;
        //     }
        //     else
        //     return true;
        // }
        // if(low>=m )
        // return false;
        // int row=low;
        // low=0;
        // high=n-1;
        //  while(low<=high)
        // {
        //     int mid=low+(high-low)/2;
        //     if(target>a[row][mid])
        //     {
        //        low=mid+1;
        //     }
        //     else if(target<a[row][mid])
        //     {
        //        high=mid-1;
        //     }
        //     else 
        //     return true;
        // }
        // return false;
        //optimal Solution from Striver
        int m=a.length,n=a[0].length;
        int low=0,high=m*n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid/n][mid%n]==target)
            return true;
            else if(a[mid/n][mid%n]<target)
            {
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return false;
    }
}