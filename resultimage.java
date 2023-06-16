/*Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.*/
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
     //transpose of matrix
        for(int i=0;i<=n-2;i++) 
        {
            for(int j=i+1;j<n;j++)
            {
                swap(matrix,i,j);
            }
        }  
        for(int i=0;i<n;i++)
        {
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
           arr[i]=arr[i]+arr[n-1-i];
           arr[n-1-i]=arr[i]-arr[n-1-i];
           arr[i]=arr[i]-arr[n-1-i];
        }
    }
    public static void swap(int[][] mat,int i,int j)
    {
            mat[i][j]=mat[i][j]+mat[j][i];
            mat[j][i]=mat[i][j]-mat[j][i];
            mat[i][j]=mat[i][j]-mat[j][i];
            // int temp=mat[i][j];
            // mat[i][j]=mat[j][i];
            // mat[j][i]=temp;
    }
}