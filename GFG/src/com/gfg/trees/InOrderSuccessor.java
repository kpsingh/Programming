package com.gfg.trees;

public class InOrderSuccessor {
	public static void main(String[] args)
	{
		BST5 bst = new BST5();
		bst.add(20);
		bst.add(8);
		bst.add(22);
		bst.add(4);
		bst.add(12);
		bst.add(10);
		bst.add(14);
		Node5 result = bst.inOrderSuccessor(10);
		System.out.println(result.data);

	}

}

class Node5 {
	int data;
	Node5 left;
	Node5 right;

	Node5(int data) {
		this.data = data;
	}

	public Node5 inOrderSuccessor(Node5 root, int data)
	{
		Node5 element = findNode(root, data);
		if (element == null)
		{
			return null;
		}
		// Case2 - When there is right subtree then we have to pick minimum of
		// the right subtree.

		if (element.right != null)
		{
			Node5 result = findMin(element.right);
			return result;
		}
		// Case 3 - When there is no right sub tree for finding node;
		else
		{
			Node5 sucessor = null;
			Node5 current = root;

			while (current != element)
			{
				if (current.data > data)
				{
					sucessor = current;// we have to keep track of only left not
										// right.
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

	private Node5 findMin(Node5 root)
	{
		while (root.left != null)
		{
			root = root.left;
		}
		return root;
	}

	private Node5 findNode(Node5 root, int data)
	{
		while (root != null)
		{
			if (root.data == data)
			{
				return root;
			}
			if (data < root.data)
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

	public void add(Node5 root, int data)
	{
		if (root == null)
		{
			root = new Node5(data);
			return;
		}
		else
		{
			if (data < root.data)
			{
				if (root.left == null)
				{
					root.left = new Node5(data);
					return;
				}
				add(root.left, data);
			}
			else
			{
				if (root.right == null)
				{
					root.right = new Node5(data);
					return;
				}
				add(root.right, data);
			}
		}
	}
}

class BST5 {
	Node5 root;

	BST5() {
		root = null;
	}

	public Node5 inOrderSuccessor(int data)
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
			root = new Node5(data);
		}
		else
		{
			root.add(root, data);
		}
	}

}