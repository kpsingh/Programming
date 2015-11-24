package com.hcl.symentac;

public class BinaryTree {

	TNode root;

	public BinaryTree() {
		root = null;
	}

	public void add(int data)

	{
		if (root == null)
		{
			root = new TNode(data);
			return;
		}
		else
		{
			add(root, data);
		}

	}

	private void add(TNode root, int data)
	{
		if (data < root.data)
		{
			if (root.left == null)
			{
				root.left = new TNode(data);
				return;
			}
			else
			{
				add(root.left, data);
			}
		}
		else
		{
			if (root.right == null)
			{
				root.right = new TNode(data);
				return;
			}
			else
			{
				add(root.right, data);
			}
		}
	}

	public void inOrder()
	{
		if (root == null)
			return;
		else
			inOrder(root);
	}

	private void inOrder(TNode root)
	{
		if (root == null)
			return;

		inOrder(root.right);
		System.out.print(root.data + " ");
		// System.out.println();
		inOrder(root.left);

	}

	public void printImage()
	{
		if (root == null)
		{
			return;
		}
		else
		{
			printImage(root);
		}

	}

	private void printImage(TNode root)
	{
		if (root == null)
			return;

		printImage(root.right);

		TNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		printImage(root.left);

	}

	public void imageInOrder()
	{
		if (root == null)
			return;
		else
			imageInOrder(root);
	}

	private void imageInOrder(TNode root)
	{
		if (root == null)
			return;
		imageInOrder(root.right);
		System.out.print(root.data + " ");
		// System.out.println();
		inOrder(root.left);

	}

}
