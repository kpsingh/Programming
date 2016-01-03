package com.gfg.trees;

public class BST {
	Node root;

	public BST() {
		root = null;
	}

	public void add(int data)
	{
		if (root == null)
		{
			root = new Node(data);
		}
		else
		{
			root.add(root, data);
		}
	}

	public int findLCA(int low, int high)
	{
		if (root == null)
		{
			return -1;
		}
		else
		{
			return root.findLCA(root, low, high);
		}
	}
	
	public void inOrder()
	{
		if(root == null)
		{
			return;
		}
		else
		{
			root.inOrder(root);
		}
	}

}
