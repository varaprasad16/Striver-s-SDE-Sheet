/*Merge Sorted Array
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // LinkedList<Integer> list=new LinkedList<>();
        // for(int i=0;i<m;i++)
        // {
        //     list.add(nums1[i]);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     list.add(nums2[i]);
        // }
        // Collections.sort(list);
        // for(int i=0;i<m+n;i++)
        // {
        //     nums1[i]=list.get(i);
        // }      
        //02/05/2023     
        int ind=0;
        int right=0;
        int left=0;
        while(left<m-n && right<n)
        {
            if(nums1[left]>nums2[right])
            {
                swap(nums1,nums2,left,right);
            }
            left++;
        }
        while(right<n)
        {
            nums1[ind++]=nums2[right++];
        }
    }
    public static void swap(int[] nums1,int[] nums2,int i,int j)
    {
        int temp=nums1[i];
        nums1[i]=nums2[j];
        nums2[j]temp;
    }
}