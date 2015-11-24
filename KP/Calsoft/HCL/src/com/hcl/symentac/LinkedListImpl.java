package com.hcl.symentac;

public class LinkedListImpl {

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(51);
		list.add(15);
		list.add(25);
		list.add(55);

		System.out.println("Before Remove " + list.get(3));
		System.out.println(list.remove(3));
		System.out.println("After Remove  " + list.get(3));
		
	}

}

class LinkedList {
	Node header;
	int size;

	public LinkedList() {
		header = null;
		size = 0;
	}

	public void add(int data)
	{
		if (header == null)
		{
			header = new Node(data);
			size++;
		}
		else
		{
			Node currrentNode = header;

			while (currrentNode.next != null)
			{
				currrentNode = currrentNode.next;
			}
			currrentNode.next = new Node(data);
			size++;
		}
	}

	public int get(int index)
	{
		int data = 0;

		if (index < 0 || index > size)
		{
			throw new IllegalArgumentException("Please prvide valid index");
		}
		else if (size == 0)
		{
			System.out.println("List is empty...");
		}
		else
		{
			Node currrentNode = header;

			for (int i = 0; i < index - 1; i++)
			{
				currrentNode = currrentNode.next;

			}
			data = currrentNode.data;
		}
		return data;
	}

	public int remove(int index)
	{
		int data;
		if (index < 0 || index > size)
		{
			throw new IllegalArgumentException("Please proide valid index...");
		}
		else

		{
			Node currrentNode = header;

			for (int i = 0; i < index - 2; i++)
			{
				currrentNode = currrentNode.next;
			}

			data = currrentNode.data;
			currrentNode.next = currrentNode.next.next;
		}
		return data;
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}