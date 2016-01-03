package com.serching.binary.self;



public class BinarySearchdemo {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
/*		bst.add(25);
		bst.add(10);
		bst.add(5);
		bst.add(6);
		bst.add(3);
		bst.add(35);
		bst.add(28);
		bst.add(8);
	    bst.add(4);*/
		
		bst.add(8);
		bst.add(4);
		bst.add(10);
		bst.add(2);
		bst.add(6);
		bst.add(5);
		bst.add(9);
		
//		System.out.println(bst.min());
//		System.out.println(bst.max());
		
		bst.inOrder();
		System.out.println();
//		System.out.println("Height is : " + bst.getHeight());
//		System.out.println("Number of Nodes are : " + bst.findNumberOfNode());
//		bst.findInOrderSucessorAndPredecessor(6);
		System.out.println("Is tree is BST : " + bst.isBST());
		
		
		
		
	
		
	}

}
