package com.amit.assignment;

public class SingleNumber 
{
	public static int singleNumber(int[] nums) 
	{
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            count = 0;
            for (int j = 0; j < nums.length; j++) 
            {
                if (nums[i] == nums[j]) 
                {
                    count++;
                }
            }
            if (count == 1) 
            {
                return nums[i];
            }
        }
        return 0;
    }

	public static void main(String[] args) 
	{
		//int[] arr=new int[]{4,1,2,1,2};
		//int[] arr=new int[]{1};
		int[] arr=new int[]{2,2,1};
		System.out.println(singleNumber(arr));
				
				
		

	}

}
