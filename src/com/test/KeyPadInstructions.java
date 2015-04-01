package com.test;

public class KeyPadInstructions 
{
	public static void main(String args[])
	{
		String test = "aparna";
		int current = 0;
		for (int i = 0; i < test.length(); i++)
		{
			move(current, test.charAt(i) - 'a', 4);
			current = test.charAt(i) - 'a';
		}
	}

	public static void move(int current, int destination, int n)
	{
		//up-down movement
		if ((current/n) < (destination/n))
		{
			System.out.println("Move " + ((destination/n) - (current/n)) + " steps down");
		}
		else if ((current/n) > (destination/n))
		{
			System.out.println("Move " + ((current/n) - (destination/n)) + " steps up");
		}
		else 
		{
			//same row - no move
		}
		//left-right movement - cursor should be in the destination’s row now
		if ((current%n) < (destination%n))
		{
			System.out.println("Move " + ((destination%n) - (current%n)) + " steps right");
		}
		else if ((current%n) > (destination%n))
		{
			System.out.println("Move " + ((current%n) - (destination%n)) + " steps left");
		}
		else 
		{
			//same column- no move
		}
		System.out.println("Click Enter");
	}

}
