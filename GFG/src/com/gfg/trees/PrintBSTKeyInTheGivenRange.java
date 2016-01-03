package com.gfg.trees;

public class PrintBSTKeyInTheGivenRange {
	public static void main(String[] args)
	{
		BST2 bst = new BST2();
		bst.insert(20);
		bst.insert(8);
		bst.insert(22);
		//bst.insert(4);
		bst.insert(12);
		bst.insert(2);
		bst.insert(1);
		bst.search(10, 25);
		System.out.println("Height of BST is: " +bst.height());

	}

}

/*
 * Node cclass to hold the data
 */
class Node2 {
	int data;
	Node2 left;
	Node2 right;

	Node2(int data) {
		this.data = data;
		left = null;
		right = null;

	}

}

/*
 * BST class to implement the functionality
 */

class BST2 {
	Node2 root;

	BST2() {
		root = null;
	}

	public void insert(int data)
	{
		if (root == null)
		{
			root = new Node2(data);
			return;
		}
		insert(root, data);
	}

	private void insert(Node2 root, int data)
	{
		if (root == null)
			return;

		if (data < root.data)
		{
			if (root.left == null)
			{
				root.left = new Node2(data);
				return;
			}
			insert(root.left, data);
		}
		else
		{
			if (root.right == null)
			{
				root.right = new Node2(data);
				return;
			}
			insert(root.right, data);
		}

	}

	public void search(int min, int max)
	{
		if (root == null)
			return;
		else
			search(root, min, max);
	}

	private void search(Node2 root, int min, int max)
	{
		if (root == null)
		{
			return;
		}

		if (root.data > max)
		{
			search(root.left, min, max);
		}
		else if (root.data < min)
		{
			search(root.right, min, max);
		}
		else
		{
			search(root.left, min, max);
			System.out.println(root.data + " ");
			search(root.right, min, max);
		}

	}
	
	public int height()
	{
		if(root == null)
			return 0;
		else
			return height(root);
	}

	public int height(Node2 root)
	{
		if (root == null)
			return -1;
		int left = height(root.left) + 1;
		int right = height(root.right) + 1;

		return left > right ? left : right;

	}

}