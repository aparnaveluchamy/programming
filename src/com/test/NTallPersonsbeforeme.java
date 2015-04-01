package com.test;

import java.util.HashMap;

public class NTallPersonsbeforeme 
{
	int[] result = new int[4];
	public static void main(String args[])
	{
		HashMap<Integer, Integer>  heightvsNumberOfTallsBefore = new HashMap<Integer, Integer>();
		heightvsNumberOfTallsBefore.put(5, 0);
		heightvsNumberOfTallsBefore.put(4, 3);
		heightvsNumberOfTallsBefore.put(9, 0);
		heightvsNumberOfTallsBefore.put(3, 2);
		heightvsNumberOfTallsBefore.put(8, 0);
		int[] result = new int[4];
		for (int i = 1; i < heightvsNumberOfTallsBefore.size(); i++)
		{
			if (heightvsNumberOfTallsBefore.get(i) != null) {}
		}
	}

	private static int findTallsBeforeMe(Integer integer) 
	{
		return 0;
	}
}
