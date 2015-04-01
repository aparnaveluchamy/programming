package com.test;

public class Fibonacci 
{
	public static void main(String args[])
	{
		long n=50;
		long t1 = System.currentTimeMillis(); 
		//int nth = recurse(n);
		//System.out.println("Recursion : " + nth + ":" + (System.currentTimeMillis()-t1));
		//t1=System.currentTimeMillis();
		long nth = bottumUP(n);
		System.out.println("BottomUpDP : " + nth + ":" + (System.currentTimeMillis()-t1));
		//nth = dp(n);
		//System.out.println("DP : " + nth + ":" + (System.currentTimeMillis()-t1));
	}
	private static int a[];
	private static long dp(int n) 
	{
		if (a == null)
		{
			a = new int[n+1];
		}
		if (n == 1 || n == 2)
		{
			a[n] = 1;
			return 1;
		}
		else if (a[n] != 0)
		{
			return a[n];
		}
		else
		{
			return dp(n-1) + dp(n-2);
		}
	}
	
	private static long bottumUP(long n)
	{
		if (n ==1 || n==2)
		{
			return 1;
		}
		long fnOfn_1 = 1;
		long fnOfn_2 = 1;
		long fnOfn=0;
		while (n>2)
		{
			fnOfn = fnOfn_1 + fnOfn_2;
			fnOfn_2=fnOfn_1;
			fnOfn_1=fnOfn;
			n--;
		}
		return fnOfn;
	}

	private static int recurse(int n) 
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return recurse(n-1) + recurse(n-2);
		}
	}
	
}
