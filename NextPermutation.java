/*Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).*/
class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;    
        }
        if(i>=0)
        {
            int j=nums.length-1; 
            while(j>=0 && nums[i]>=nums[j])
                j--;
            swap(nums,i,j);
        } 
        reverse(nums,i+1);
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
    public void reverse(int[] nums,int start)
    {
        int end=nums.length-1;
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
        
    }
}