package com.test;

public class MajorityElement 
{
	public static void main(String[] args)
	{
		int a[]= {1 ,2 ,4 ,2 ,4, 5 ,4 ,1 ,4};
		int major_index1=0, major_index2=1, count1=2, count2=2;
		for(int i=1;i<a.length;i++)
		{
			if(a[major_index1] == a[i])	
			{	
				count1 = count1+2;
			}
			else if(a[major_index2] == a[i])
			{
				count2 = count2+2;
			}
			else
			{
				count1--;
				count2--;
			}
			
			if(count1==0)
			{
				major_index1 =i;
				for(i=i;i<a.length;i++)
				{
					if(a[major_index1]==a[major_index2])
					{
						i++;
					}
					else
					{
						break;
					}
				}
				count1 = 2;
			}
			if(count2 == 0)
			{
				major_index2 =i;
				for(i=i;i<a.length;i++)
				{
					if(a[major_index1]==a[major_index2])
					{
						i++;
					}
					else
					{
						break;
					}
				}
				count2 = 2;
			}
		}
		System.out.println(a[major_index1]);
		System.out.println(a[major_index2]);
		}
}
