package com.gfg.trees;

public class LowestCommonAncestor {
	public static void main(String[] args)
	{
		BST bst = new BST();
		bst.add(20);
		bst.add(8);
		bst.add(22);
		bst.add(4);
		bst.add(12);
		bst.add(10);
		bst.add(14);
		bst.inOrder();
		bst.findLCA(4, 20);
		
		
		
		
	}

}
