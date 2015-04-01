package com.test;

public class NSubstring 
{
	public static void main(String args[])
	{
		String test = "rrerrerree";
		String pattern = "";
		for (int i = 0; i< (test.length()/2); i++)
		{
			pattern += test.charAt(i);
			if (test.length() % pattern.length() == 0)
			{
				int n;
				for (n= 0; n<(test.length()/pattern.length()); n++)
				{
					if (! test.substring(n*pattern.length(), (n*pattern.length()) + pattern.length()).equals(pattern))
					{
						break;
					}
				}
				if (n == (test.length()/pattern.length()))
				{
					System.out.println("Pattern : " + pattern + " repeats in " + test + " " + n + " times");
				}
			}
			else
			{
				continue;
			}
		}
	}
}
