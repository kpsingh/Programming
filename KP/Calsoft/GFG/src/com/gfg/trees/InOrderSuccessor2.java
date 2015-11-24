package com.gfg.trees;

public class InOrderSuccessor2 {
	public static void main(String[] args)
	{
		BST6 bst = new BST6();
		bst.add(20);
		bst.add(8);
		bst.add(22);
		bst.add(4);
		bst.add(12);
		bst.add(10);
		bst.add(14);
		Node6 result = bst.inOrderSuccessor(10);
		System.out.println(result.data);

	}

}

class Node6 {
	int data;
	Node6 left;
	Node6 right;

	Node6(int data) {
		this.data = data;
	}

	public Node6 inOrderSuccessor(Node6 root, int data)
	{
		Node6 element = find(root, data);

		if (element == null)
			return null;

		if (element.right != null)
		{
			return findMin(element.right);
		}
		else
		{
			Node6 sucessor = null;
			Node6 current = root;

			while (current != element)
			{
				if (current.data > data)
				{
					sucessor = current;
					current = current.left;
				}
				else
				{
					current = current.right;
				}
			}
			return sucessor;
		}

	}

	private Node6 findMin(Node6 root)
	{
		while (root.left != null)
		{
			root = root.left;
		}
		return root;
	}

	public Node6 find(Node6 root, int data)
	{
		while (root != null)
		{
			if (root.data == data)
			{
				return root;
			}
			else if (root.data > data)
			{
				root = root.left;
			}
			else
			{
				root = root.right;
			}
		}

		return null;
	}

	public void add(Node6 root, int data)
	{
		if (root == null)
		{
			root = new Node6(data);
			return;
		}
		else
		{
			if (data < root.data)
			{
				if (root.left == null)
				{
					root.left = new Node6(data);
					return;
				}
				add(root.left, data);
			}
			else
			{
				if (root.right == null)
				{
					root.right = new Node6(data);
					return;
				}
				add(root.right, data);
			}
		}
	}
}

class BST6 {
	Node6 root;

	BST6() {
		root = null;
	}

	public Node6 inOrderSuccessor(int data)
	{
		// Case1.
		if (root == null)
		{
			return null;
		}
		else
		{
			return root.inOrderSuccessor(root, data);
		}
	}

	public void add(int data)
	{
		if (root == null)
		{
			root = new Node6(data);
		}
		else
		{
			root.add(root, data);
		}
	}

}