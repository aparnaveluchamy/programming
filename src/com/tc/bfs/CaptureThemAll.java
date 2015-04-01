package com.tc.bfs;

import java.util.ArrayList;
import java.util.List;

public class CaptureThemAll 
{
	private boolean[][] visited = new boolean[8][8];
	public int fastKnight(String knight, String rook, String queen)
	{
		int steps = 0;
		visited[knight.charAt(1) - 1][knight.charAt(0) -'a'] = true;
		List<String> moves = getNextMoves(knight);
		while (true)
		{
			if (visited[rook.charAt(1) - 1][rook.charAt(0) -'a'] && visited[queen.charAt(1) - 1][queen.charAt(0) -'a'])
			{
				break;
			}
			for (String move: moves)
			{
				
			}
			steps++;
		}
		return steps;
	}
	
	private List<String> getNextMoves(String knight)
	{
		List<String> nextMoves = new ArrayList<String>();
		//(2,1)
		int column = knight.charAt(0)-'a';
		int row = knight.charAt(1);
		if ((column + 2) >= 0 && (column + 2) < 8
				&& (row + 1) >= 0 && (row + 1) < 8)
		{
			nextMoves.add(((char)(column + 'a'  + 2) + "" + (row + 1)));
			visited[row][column] = true;
		}
		//(2,-1)
		else if ((column + 2) >= 0 && (column + 2) < 8
				&& (row - 1) >= 0 && (row - 1) < 8)
		{
			nextMoves.add(((char)(column + 'a'  + 2) + "" + (row - 1)));
			visited[row][column] = true;
		}
		//(-2, 1)
		else if ((column - 2) >= 0 && (column - 2) < 8
				&& (row + 1) >= 0 && (row + 1) < 8)
		{
			nextMoves.add(((char)(column + 'a' - 2) + "" + (row + 1)));
			visited[row][column] = true;
		}
		//(-2, -1)
		else if ((column - 2) >= 0 && (column - 2) < 8
				&& (row - 1) >= 0 && (row - 1) < 8)
		{
			nextMoves.add(((char)(column + 'a' - 2) + "" + (row - 1)));
			visited[row][column] = true;
		}
		//(1, 2)
		else if ((column + 1) >= 0 && (column + 1) < 8
				&& (row + 2) >= 0 && (row + 2) < 8)
		{
			nextMoves.add(((char)(column + 'a' + 1) + "" + (row + 2)));
			visited[row][column] = true;
		}
		//(1, -2)
		else if ((column + 1) >= 0 && (column + 1) < 8
				&& (row - 2) >= 0 && (row - 2) < 8)
		{
			nextMoves.add(((char)(column + 'a' + 1) + "" + (row - 2)));
			visited[row][column] = true;
		}
		//(-1, 2)
		else if ((column - 1) >= 0 && (column - 1) < 8
				&& (row + 2) >= 0 && (row + 2) < 8)
		{
			nextMoves.add(((char)(column + 'a' - 1) + "" + (row + 2)));
			visited[row][column] = true;
		}
		//(-1, -2)
		else if ((column - 1) >= 0 && (column - 1) < 8
				&& (row - 2) >= 0 && (row - 2) < 8)
		{
			nextMoves.add(((char)(column + 'a' - 1) + "" + (row - 2)));
			visited[row][column] = true;
		}
		return nextMoves;
	}
}
