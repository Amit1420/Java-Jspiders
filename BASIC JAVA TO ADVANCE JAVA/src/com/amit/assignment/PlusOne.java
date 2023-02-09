package com.amit.assignment;

import java.util.Arrays;

public class PlusOne {
	public static int[] plusOne(int[] digits) 
	{
        int sum=0;
        int l=digits.length;
        if (digits[0]==9 && digits[l-1]==9)
        {
            for (int i = l-1; i >=0; i--) 
            {
                if (digits[i]==9){
                    sum++;
                }
            }
        }
        
        
        if (sum==digits.length)
        {
           int[] res=new int[l+1];
           res[0]=1;
            for (int i = 1; i < res.length; i++) 
            {
                res[i]=0;
            }
            return res;
        }

        for (int i = l - 1; i >= 0; i--) 
        {
            if (digits[i]==9)
            {
                digits[i]=0;
            }else 
            {
                digits[i]++;
                return digits;
            }
        }
        
        return digits;
    }



	public static void main(String[] args) {
//		int[] ar=new int[]{9};
//		int[] ar=new int[]{1,2,3};
		int[] ar=new int[]{4,3,2,1};
		int [] a=plusOne(ar);
		System.out.println(Arrays.toString(a));
		 
	}

}
