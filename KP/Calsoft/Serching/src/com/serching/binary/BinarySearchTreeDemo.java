package com.serching.binary;

public class BinarySearchTreeDemo
{

    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
    	bst.insert(20);
		bst.insert(12);
		bst.insert(10);
		bst.insert(14);
		bst.insert(8);
		bst.insert(4);
		bst.insert(22);
        System.out.println("Inorder traversal");
        bst.printInorder();

        System.out.println("Preorder Traversal");
        bst.printPreorder();

        System.out.println("Postorder Traversal");
        bst.printPostorder();

        System.out.println("The minimum value in the BST: " + bst.findMinimum());
        System.out.println("The maximum value in the BST: " + bst.findMaximum());

    }
}
