package com.serching.binary.self;

public class BinarySearchTree {

	BSTNode root;

	BinarySearchTree() {
		root = null;
	}

	public boolean add(int data)
	{
		if (root == null)
		{
			root = new BSTNode(data);
			return true;
		}
		else
		{
			return root.add(data, root);
		}
	}

	public boolean search(int data)
	{
		if (root == null)
		{
			return false;
		}

		else
		{
			return root.search(data, root);

		}
	}

	public void preOrder()
	{
		if (root == null)
		{
			return;
		}
		else
		{
			root.preOrder(root);
		}
	}

	public int min()
	{
		if (root == null)
		{
			return -1;
		}
		else
		{
			return root.min(root);
		}
	}

	public int max()
	{
		if (root == null)
		{
			return -1;
		}
		else
		{
			return root.max(root);
		}
	}

	public boolean remove(int data)
	{
		if (root == null)
		{
			return false;
		}
		else
		{
			return root.remove(data, root);
		}
	}

	public void inOrder()
	{
		if (root == null)
		{
			return;
		}
		else
		{
			root.inOrder(root);
		}
	}

	public void inOrder(int min, int max)
	{
		if (root == null)
		{
			return;
		}
		else
		{
			root.inOrder(min, max, root);
		}
	}

	public int getHeight()
	{
		if (root == null)
			return 0;
		else
		{
			return root.getHeight(root);
		}
	}

	public int findNumberOfNode()
	{
		if (root == null)
			return 0;
		else
			return root.findNumberOfNode(root);
	}

	public void findInOrderSucessorAndPredecessor(int data)
	{
		if (root == null)
			return;
		else
			root.findInOrderSucessorAndPredecessor(root, data);

	}

	public boolean isBST()
	{
		if (root == null)
			return true;
		else
			//return root.isBST(root);
			//return root.isBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
			return root.isBST2(root);

	}

	

}
