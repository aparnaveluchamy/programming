package com.test;

public class BSTNode
{
	private BSTNode _left;
	private BSTNode _right;
	private int _key;
	
	public BSTNode(int key)
	{
		_key = key;
	}
	
	public BSTNode getLeft()
	{
		return _left;
	}
	
	public int getKey()
	{
		return _key;
	}
	
	public BSTNode getRight()
	{
		return _right;
	}
	
	public void setLeft(BSTNode node)
	{
		_left = node;
	}
	
	public void setRight(BSTNode node)
	{
		_right = node;
	}
}
