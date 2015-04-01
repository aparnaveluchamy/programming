package com.test;

public class BST 
{
	private BSTNode _root;	
	public static void main(String args[])
	{
		BST bst = new BST();
		bst.addNode(10);
		bst.addNode(10);
		bst.addNode(15);
		bst.addNode(10);
		bst.addNode(44);
		bst.addNode(32);
		bst.addNode(3);
		bst.addNode(0);
		bst.addNode(12);
		bst.search(33);
		bst.search(32);
		bst.traverseAndPrint();
	}
	
	public void search(int element)
	{
		
	}
	
	public void traverseAndPrint()
	{
		if (_root != null)
		{
			inOrder(_root);
		}
	}
	
	public void inOrder(BSTNode node)
	{
		if (node == null)
		{
			return;
		}
		inOrder(node.getRight());
		System.out.println(node.getKey());
		inOrder(node.getLeft());
	}
	
	public void addNode(int key)
	{
		if (_root == null)
		{
			_root = new BSTNode(key);
		}
		else 
		{
			BSTNode parentNode = findParent(_root, key);
			if (key < parentNode.getKey())
			{
				parentNode.setLeft(new BSTNode(key));
			}
			else
			{
				parentNode.setRight(new BSTNode(key));
			}
		}
	}
	
	public BSTNode findParent(BSTNode node, int key)
	{
		if (key < node.getKey())
		{
			if (node.getLeft() != null)
			{
				return findParent(node.getLeft(), key);
			}
			else
			{
				return node;
			}
		}
		else
		{
			if (node.getRight() != null)
			{
				return findParent(node.getRight(), key);
			}
			else
			{
				return node;
			}
		}
	}
}
