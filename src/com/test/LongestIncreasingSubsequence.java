package com.test;

public class LongestIncreasingSubsequence 
{
	public static void main(String args[])
	{
		int [] a = {22, 10, 11, 33, 27, 50, 41, 60};
		int lis[] = new int[a.length];
		for (int i=0;i<a.length;i++)
		{
			lis[i]=1;
		}
		for (int i = 1; i < a.length; i++)
		{
			for (int j=0; j<i; j++)
			{
				if ((a[j] < a[i]) && (lis[i]<lis[j]+1))
				{
					lis[i] = lis[j]+1;
				}
			}
		}
		System.out.println(lis);
	}
}
