Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
import java.io.*;
import java.util.* ;

public class MatrixZeros {
    public static void setZeros(int matrix[][]) {
        int m=matrix.length;
        int n=matrix[0].length;
    //    for(int i=0;i<m;i++)
    //    {
    //        for(int j=0;j<n;j++)
    //        {
    //            if(matrix[i][j]==0)
    //            {
    //                colmark(j,m,matrix);
    //                rowmark(i,n,matrix);
    //            }
    //        }
    //    }
    //    for(int i=0;i<m;i++)
    //    {
    //        for(int j=0;j<n;j++)
    //        {
    //            if(matrix[i][j]==-1)
    //            {
    //                matrix[i][j]=0;
    //            }
    //            //System.out.print(matrix[i][j]+" ");
    //        }
    //        //System.out.println();
    //    }
    int[] row=new int[m],col=new int[n];
    Arrays.fill(row,-1);
    Arrays.fill(col,-1);
    for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(row[i]!=0)
                    row[i]=0;
                    if(col[j]!=0)
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(row[i]==0 ||col[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

    }
    public static void colmark(int col,int len,int[][] a)
    {
        for(int i=0;i<len;i++)
        {
            if(a[i][col]!=0)
            a[i][col]=-1;
        }
    }
    public static void rowmark(int row,int len,int[][] a)
    {
        for(int i=0;i<len;i++)
        {
            if(a[row][i]!=0)
            a[row][i]=-1;
        }
    }

}