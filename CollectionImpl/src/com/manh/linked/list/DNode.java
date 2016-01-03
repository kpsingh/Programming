package com.manh.linked.list;

public class DNode {
	int data;
	DNode next;
	DNode prev;

	public DNode(int data) {
		this.data = data;

	}

	public DNode reverse(DNode header)
	{
		DNode prev = null;
		DNode curr = header;
		DNode next;

		while (curr != null)
		{
			next = curr.next;
			curr.next = prev;
			if (prev != null)
			{
				prev.prev = curr;
			}
			prev = curr;
			curr = next;
		}

		prev.prev = null;
		return prev;
	}

	public void print(DNode header)
	{

		DNode currNode = header;

		while (currNode != null)
		{
			System.out.print(currNode.data + ", ");
			currNode = currNode.next;

		}

	}

	public DNode getPrev(DNode header, int data)
	{
		while (header != null)
		{
			if (header.data == data)
			{
				return header.prev;
			}
			header = header.next;
		}
		return null;
	}

	public DNode getNext(DNode header, int data)
	{
		while (header != null)
		{
			if (header.data == data)
			{
				return header.next;
			}
			header = header.next;
		}
		return null;
	}

	public DNode reverseRec(DNode header)
	{
		if (header.next == null)
			return header;

		DNode secElement = header.next;
		header.next = null;

		DNode result = reverseRec(secElement);
		secElement.next = header;
		header.prev = secElement;
		result.prev = null;

		return result;
	}

}
