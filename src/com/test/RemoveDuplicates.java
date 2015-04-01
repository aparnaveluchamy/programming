package com.test;

public class RemoveDuplicates
{
	public static void main(String args[])
	{
		char[] str = {'t','t',' ','t','f','t'};
		int tail = 1;
		for (int i =1 ;i <str.length;++i)
		{
			int j;
			for (j = 0;j<tail ; ++j)
			{
				if(str[i] == str[j]) break;
			}
			if(j == tail)
			{
				str[tail] = str[i];
				++tail;
			}
		}
		
		str[tail]=0;
		int a = str[tail];
		System.out.println(str);
	}
}