package com.serching.binary.self;

public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;

	BSTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public boolean add(int data, BSTNode currentNode)
	{
		if (data == currentNode.data)
		{
			return false;
		}
		else if (data < currentNode.data)// changed
		{
			if (currentNode.left == null)
			{
				currentNode.left = new BSTNode(data);
				return true;
			}
			else
			{
				return currentNode.add(data, currentNode.left);
			}
		}
		else
		{
			if (currentNode.right == null)
			{
				currentNode.right = new BSTNode(data);
				return true;

			}
			else
			{
				return currentNode.add(data, currentNode.right);
			}
		}
	}

	public boolean search(int data, BSTNode currentNode)
	{
		if (data == currentNode.data)
		{
			return true;
		}
		else if (data < currentNode.data)
		{
			if (currentNode.left == null)
			{
				return false;
			}
			else
			{
				return currentNode.search(data, currentNode.left);
			}
		}
		else
		{
			if (currentNode.right == null)
			{
				return false;
			}
			else
			{
				return currentNode.search(data, currentNode.right);
			}
		}

	}

	public void inOrder(BSTNode currentNode)
	{
		if (currentNode == null)
		{
			return;
		}

		currentNode.inOrder(currentNode.left);
		System.out.print(currentNode.data + " ");
		currentNode.inOrder(currentNode.right);

	}

	public int min(BSTNode currentNode)
	{
		while (currentNode.left != null)
		{
			currentNode = currentNode.left;
		}
		return currentNode.data;
	}

	public int max(BSTNode currentNode)
	{
		while (currentNode.right != null)
		{
			currentNode = currentNode.right;
		}
		return currentNode.data;
	}

	public boolean remove(int data, BSTNode root)
	{
		BSTNode current = root;
		BSTNode parent = root;
		boolean isLeft = true;

		while (current.data != data)
		{
			parent = current;
			if (data < current.data)
			{
				isLeft = true;
				current = current.left;
			}
			else
			{
				isLeft = false;
				current = current.right;
			}

			if (current == null)
			{
				return false;
			}
		}

		// 1. Node with no children.
		if (current.left == null && current.right == null)
		{
			if (current == root)
			{
				root = null;
			}
			else if (isLeft)
			{
				parent.left = null;
			}
			else
			{
				parent.right = null;
			}
		}

		// 2. Node with one child.

		// if no right child, replace with left subtree
		else if (current.right == null)
		{
			if (current == root)
			{
				root = current.left;
			}
			else if (isLeft)
			{
				parent.left = current.left;
			}
			else
			{
				parent.right = current.left;
			}
		}

		// if no left child, replace with right subtree
		else if (current.left == null)
		{
			if (current == root)
			{
				root = current.right;
			}
			else if (isLeft)
			{
				parent.left = current.right;
			}
			else
			{
				parent.right = current.right;
			}
		}

		// 3. Node with two children, replace with inorder sucessor

		else
		{
			BSTNode sucessor = getSucessor(current);

			if (root == current)
			{
				root = sucessor;
			}
			else if (isLeft)
			{
				parent.left = sucessor;
			}
			else
			{
				parent.right = sucessor;
			}

			// curretn sucessor to current left child

			sucessor.left = current.left;

		}

		return true;
	}

	// Code to get the in order successor, basically minimum of right element
	private BSTNode getSucessor(BSTNode delNode)
	{
		BSTNode sucessorParent = delNode;
		BSTNode sucessor = delNode;
		BSTNode currrent = delNode.right; // go right until it ends.

		while (currrent != null)
		{
			sucessorParent = sucessor;
			sucessor = currrent;
			currrent = currrent.left;
		}

		// if sucessor not right child, make connection.
		if (sucessor != delNode.right)
		{
			sucessorParent.left = sucessor.right;
			sucessor.right = delNode.right;
		}
		return sucessor;

	}

	public void preOrder(BSTNode root)
	{
		if (root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public void inOrder(int min, int max, BSTNode root)
	{
		if (root == null || root.data < min || root.data > max)
		{
			return;
		}

		inOrder(min, max, root.left);
		System.out.print(root.data + " ");
		inOrder(min, max, root.right);

	}

	public int getHeight(BSTNode root)
	{
		if (root == null)
		{
			return -1;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);

		return left > right ? (left + 1) : (right + 1);
	}

	public int findNumberOfNode(BSTNode root)
	{
		if (root == null)
		{
			return 0;
		}

		int left = findNumberOfNode(root.left);
		int right = findNumberOfNode(root.right);

		return (left + right + 1);

	}

	public void findInOrderSucessorAndPredecessor(BSTNode root, int data)
	{
		if (root != null)
		{
			if (data == root.data)
			{
				if (root.left != null && root.right != null)
				{
					int predecessor = max(root.left);
					int sucessor = min(root.right);
					System.out.println("Predecessor:" + predecessor
							+ ". Sucessor:" + sucessor);
				}
				else if (root.left != null)
				{
					int predecessor = max(root.left);
					System.out.println("Predecessor:" + predecessor
							+ ", Sucessor not found");
				}
				else if (root.right != null)
				{
					int sucessor = min(root.right);
					System.out.println("Sucessor:" + sucessor
							+ ", Predecessor not found");
				}

				else
				{
					System.out.println("No Predecessor and Sucessor found");
				}
				return;
			}

			else if (data < root.data)
			{
				findInOrderSucessorAndPredecessor(root.left, data);
			}
			else
			{
				findInOrderSucessorAndPredecessor(root.right, data);
			}

		}
		else
		{
			System.out.println("No element found");
		}

	}

	/*
	 * Method to check id the Binary tree is BST or not. Simple but wrong
	 * method.
	 */
	public boolean isBST(BSTNode root, int MIN, int MAX)
	{
		if (root == null)
			return true;

		if (root.left != null)
		{
			if (root.data > MAX)
			{
				return false;
			}
			else
			{
				isBST(root.left, MIN, root.data);
			}
		}
		else if (root.right != null)
		{
			if (root.data < MIN)
				return false;
			else
				isBST(root.right, root.data, MAX);
		}

		return true;
	}

	/*
	 * Method to check if the Binary tree is BST or not. Correct and efficient.
	 */

	public boolean isBST2(BSTNode root)
	{
		if (root == null)
			return true;

		if (root.left != null)
		{
			if (root.max(root.left) > root.data)
				return false;
			else
				isBST2(root.left);
		}
		else if (root.right != null)
		{
			if (root.data > root.max(root.right))
				return false;
			else
				isBST2(root.right);
		}
		return true;

	}

}
