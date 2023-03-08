package com.amit.programming;
class A{
public static int Power(int out,int res)
{
    int count=res;
        int temp=1;
        while(count!=0)
        {
            temp=temp*out;
            count--;
        }
        return temp;
}
public static int count1(int num)
{
    int count=0;
    while(num!=0)
    {
        num=num/10;
        count++;
    }
    return count;
}
public static int isArmstrong(int num)
{
    int out;
    int sum=0;
    int res=count1(num);
    while(num!=0)
    {
        out=num%10;
        sum=sum+Power(out,res);
        num=num/10;
    }
    return sum;
}
public static void  main(String[] args)
{
    int start=10;
    int end=100000;
    for(int i=start;i<=end;i++)
    {
    int result=isArmstrong(i);
    if(result==i) System.out.println(i);
 
    }
    
}
}