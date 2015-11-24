package com.serching.binary.questions;

/*
 * Binary Search Tree
 */
public class BinarySearchTree
{
    Node root;

    public BinarySearchTree insert(int data)
    {
        Node node = new Node(data);
        if (root == null)
        {
            root = node;
            return this;
        }
        else
        {
            insertRec(root, node);
            return this;
        }
    }

    private void insertRec(Node root2, Node node)
    {
        if (root.data >= node.data)
        {
            if (root.left == null)
            {
                root.left = node;
                return;
            }
            else
            {
                insertRec(root.left, node);
            }
        }
        else
        {
            if (root.right == null)
            {
                root.right = node;
                return;
            }
            else
            {
                insertRec(root.right, node);
            }
        }

    }
    

}
