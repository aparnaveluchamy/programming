package com.test;

public class TrimSpaces
{
	
	public static void main(String args[])
	{
		System.out.print(trimSpaces("  Hello  World    ".toCharArray()));
	}

	static String trimSpaces(char[] inp)
	{
		boolean firstSpaces=true;
		int k=0;
		for(int i=0; i < inp.length;i++)
		{
			if(inp[i]==' ' && firstSpaces)
			{
				inp[k]=' ';
				k++;firstSpaces=false;
			}else if(inp[i]!=' ')
			{
				firstSpaces=true;
				inp[k]=inp[i];
				k++;
			}
		}
		String output=new String(inp);
		return output.substring(0,k);
	}
}
