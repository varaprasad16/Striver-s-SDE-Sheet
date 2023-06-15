/* Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:*/
class Solution {
    public List<List<Integer>> generate(int num) {
     List<List<Integer>> list=new LinkedList<>();
     List<Integer> prev=new LinkedList<>();
     prev.add(1);
     list.add(prev);
     if(num==1)
     return list;
     for(int i=1;i<num;i++)
     {
         List<Integer> New=new LinkedList<>();
         New.add(1);
         for(int j=1;j<i;j++)
         {
             New.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
         }
         New.add(1);
         list.add(New);
     }   
     return list;
    }
}