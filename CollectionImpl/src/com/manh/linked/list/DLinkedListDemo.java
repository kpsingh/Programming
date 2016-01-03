package com.manh.linked.list;

public class DLinkedListDemo {
	public static void main(String[] args)
	{
		DLinkedList list = new DLinkedList();

		list.add(5);
		list.add(15);
		list.add(25);
		list.add(8);
		list.add(30);
		list.print();
		list.delete(25);
		System.out.println("\n" +"After Deletion");
		list.print();

		DNode reverse = list.reverse();
		System.out.println("\n" + "After reverse");
		reverse.print(reverse);
		/*
		DNode prev = reverse.getPrev(reverse, 8);
		if (prev != null)
		{

			System.out.println("\n" + "Previous is " + prev.data);
		}
		else
		{
			System.out.println("\n" + "Previous is null");
		}
		DNode next = reverse.getNext(reverse, 8);
		System.out.println("Next is " + next.data);
*/
	}

}
