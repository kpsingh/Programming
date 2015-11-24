package com.gfg.trees;

public class SortedArrayToBST {
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		Node3 bst = createBST(a, 0, a.length - 1);

		bst.preOrder(bst);
		System.out.println("Height " + bst.height(bst));

	}

	private static Node3 createBST(int a[], int start, int end)
	{
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		Node3 root = new Node3(a[mid]);
		root.left = createBST(a, start, mid - 1);
		root.right = createBST(a, mid + 1, end);

		return root;

	}

}

class Node3 {
	int data;
	Node3 left;
	Node3 right;

	Node3(int data) {
		this.data = data;
	}

	public void preOrder(Node3 root)
	{
		if (root == null)
		{
			return;
		}
		root.preOrder(root.left);
		System.out.println(root.data);
		root.preOrder(root.right);
	}

	public int height(Node3 root)
	{
		if (root == null)
			return -1;
		int left = height(root.left) + 1;
		int right = height(root.right) + 1;

		return left > right ? left : right;

	}

}