package com.gfg.trees;

public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public void add(Node root, int data)
	{
		if (root == null)
		{
			root = new Node(data);
			return;
		}
		else
		{
			if (data < root.data)
			{
				if (root.left == null)
				{
					root.left = new Node(data);
					return;
				}
				add(root.left, data);
			}
			else
			{
				if (root.right == null)
				{
					root.right = new Node(data);
					return;
				}
				add(root.right, data);
			}
		}
	}

	public int findLCA(Node root, int low, int high)
	{
		if (root.data > low && root.data < high)
		{
			System.out.println("LCA is : " + root.data);
		}
		else if(root.data == low || root.data == high)
		{
			System.out.println("LCA is : " + root.data);
		}
		else if (root.data > high)
		{
			findLCA(root.left, low, high);
		}
		else if (root.data < low)
		{
			findLCA(root.right, low, high);
		}

		return -1;

	}

	public void inOrder(Node root)
	{
		if (root == null)
		{
			return;
		}

		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}

}
