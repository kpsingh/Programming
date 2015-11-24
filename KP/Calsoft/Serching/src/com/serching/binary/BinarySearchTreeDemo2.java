package com.serching.binary;

public class BinarySearchTreeDemo2
{
    public static void main(String[] args)
    {
        BinarySearchTree2 bt = new BinarySearchTree2();
        bt.insert(10);
        bt.insert(35);
        bt.insert(8);
        bt.insert(1);
        bt.insert(55);
        // bt.insert(60);
        /*
         * System.out.println("Max and Min");
         * System.out.println(bt.findMaximum());
         * System.out.println(bt.findMinimum()); System.out.println("In Order");
         * bt.inOrderTraversal(); System.out.println("Post Order");
         * bt.postOrderTraversal(); System.out.println("Pre Order");
         * bt.preOrderTraversal();
         */
        System.out.println("PreOrder " + bt.preOrder + ", PostOrder " + bt.postOrder);
      // System.out.println(bt.isAllLeavesAreSameLevel());

    }

}

class BinarySearchTree2
{
    Node2 root;

    int preOrder = 0;

    int postOrder = 0;

    public BinarySearchTree2 insert(int value)
    {
        Node2 node = new Node2(value);

        if (root == null)
        {
            root = node;
            return this;
        }
        insertRec(root, node);
        return this;

    }

    private void insertRec(Node2 lattestNode, Node2 node)
    {
        if (lattestNode.value > node.value)
        {
            if (lattestNode.left == null)
            {
                lattestNode.left = node;
                return;
            }
            else
            {
                insertRec(lattestNode.left, node);
            }
        }
        else
        {
            if (lattestNode.right == null)
            {
                lattestNode.right = node;
                return;
            }
            else
            {
                insertRec(lattestNode.right, node);
            }

        }

    }

    public int findMaximum()
    {
        if (root == null)
        {
            return 0;
        }
        Node2 currentNode = root;

        while (currentNode.right != null)
        {
            currentNode = currentNode.right;
        }
        return currentNode.value;
    }

    public int findMinimum()
    {
        if (root == null)
        {
            return 0;
        }
        Node2 currentNode = root;

        while (currentNode.left != null)
        {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void inOrderTraversal()
    {
        inOrderTraversalRec(root);
        System.out.println("");
    }

    private void inOrderTraversalRec(Node2 curretNode)
    {
        if (curretNode == null)
        {
            return;
        }
        inOrderTraversalRec(curretNode.left);
        System.out.print(curretNode.value + ",");
        inOrderTraversalRec(curretNode.right);

    }

    public void preOrderTraversal()
    {
        preOrderTraversalRec(root);
        System.out.println("");
    }

    private void preOrderTraversalRec(Node2 currentNode)
    {
        preOrder++;
        if (currentNode == null)
        {
            return;
        }
        System.out.print(currentNode.value + ",");
        preOrderTraversalRec(currentNode.left);
        preOrderTraversalRec(currentNode.right);
    }

    public void postOrderTraversal()
    {
        postOrderTraversalRec(root);
        System.out.println("");
    }

    private void postOrderTraversalRec(Node2 currentNode)
    {
        postOrder++;
        if (currentNode == null)
        {
            return;
        }
        postOrderTraversalRec(currentNode.left);
        postOrderTraversalRec(currentNode.right);
        System.out.print(currentNode.value + ",");

    }

    public boolean isAllLeavesAreSameLevel()
    {

        boolean flag = false;
        if (root == null)
        {
            flag = true;
        }
        preOrderTraversal();
        postOrderTraversal();

        if (preOrder == postOrder)
        {
            flag = true;
        }

        return flag;

    }

}

class Node2
{
    int value;

    Node2 left;

    Node2 right;

    public Node2(int value)
    {
        this.value = value;
    }
}