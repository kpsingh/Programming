package com.gfg.linkedlist;

import java.util.LinkedList;

public class FindMergePointOfTwoLinkedList {
	public static void main(String[] args)
	{
		Node5 list1 = new Node5();
		list1.add(3);
		list1.add(6);
		list1.add(9);
		list1.add(15);
		list1.add(30);
		list1.print();

		Node5 list2 = new Node5();
		list2.add(10);
		list2.add(15);
		list2.add(30);
		list2.print();

	

		list1 = list1.getNode();
		list2 = list2.getNode();
		
		int length1 = list1.size;
		int length2 = list2.size;
		
		System.out.println(length1);
		System.out.println(length2);
		
		while (length1 > length2)
		{
			list1 = list1.next;
			length1--;
		}
		while(length2 > length1)
		{
			list2 = list2.next;
			length2--;
		}
		
		list1.print();
		list2.print();
		

	}
}

class Node5 {
	int size;
	int data;
	Node5 next;
	Node5 header = null;

	public Node5() {
		
	}
	
	Node5(int data) {
		this.data = data;
	}

	public void add(int data)
	{
		if (header == null)
		{
			header = new Node5(data);
			size++;
		}
		else
		{
			Node5 current = header;

			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new Node5(data);
			size++;
		}
	}
	
	public void print()
	{
		Node5 curr = header;
		
		while(curr!= null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
		
	}
	
	public Node5 getNode()
	{
		return header;
	}

}

