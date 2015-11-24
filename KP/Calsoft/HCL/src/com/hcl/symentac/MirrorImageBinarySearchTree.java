package com.hcl.symentac;

public class MirrorImageBinarySearchTree {
	public static void main(String[] args)
	{
		BinaryTree bst = new BinaryTree();
		bst.add(8);
		bst.add(5);
		bst.add(10);
		bst.add(3);
		bst.add(7);
		bst.add(9);
		bst.add(12);
		bst.inOrder();
		bst.printImage();
		System.out.println("\n" + "After Image");
		bst.inOrder();
	}

}

