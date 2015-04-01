package com.test;

import java.util.ArrayList;


public class PhoneDigits 
{
	public static final String[] charsForDigits = {" ", " " , "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
	public static void main(String args[])
	{
		ArrayList<String> possibleStrings = new ArrayList<String>();
		String inputPhoneNumber = "123";
		System.out.println(getPossibleStrings(inputPhoneNumber));
	}
	
	private static ArrayList<String> getPossibleStrings(String phoneNumber)
	{
		ArrayList<String> possibleStrings = new ArrayList<String>();
		if (phoneNumber.length() > 1)
		{
			int lastDigit = Integer.parseInt("" + phoneNumber.charAt(phoneNumber.length() - 1));
			ArrayList<String> previousStringFromSubStrings = getPossibleStrings(phoneNumber.substring(0, phoneNumber.length() - 1));
			for (String possibleStringFromSubString : previousStringFromSubStrings)
			{
				for (int i = 0; i < charsForDigits[lastDigit].length(); i++)
				{
					possibleStrings.add(possibleStringFromSubString + charsForDigits[lastDigit].charAt(i));
				}
			}
		}
		else if (phoneNumber.length() == 1)
		{
			int currentDigit = Integer.parseInt(phoneNumber);
			for (int i = 0; i < charsForDigits[currentDigit].length(); i++)
			{
				possibleStrings.add("" + charsForDigits[currentDigit].charAt(i));
			}
		}
		return possibleStrings;
	}

}
