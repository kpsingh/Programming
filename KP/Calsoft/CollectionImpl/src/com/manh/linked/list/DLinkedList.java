package com.manh.linked.list;

public class DLinkedList {

	private DNode header;
	private int size;

	@Override
	public String toString()
	{
		return "DLinkedList [header=" + header + ", size=" + size + "]";
	}

	public void add(int data)
	{
		if (header == null)
		{
			header = new DNode(data);
			size++;
		}

		else
		{
			DNode node = new DNode(data);
			DNode currNode = header;

			while (currNode.next != null)
			{
				currNode = currNode.next;
			}
			currNode.next = node;
			node.prev = currNode;
			size++;
		}

	}

	public DNode reverse()
	{
		if (header == null)
			return null;
		return header.reverse(header);

	}

	public DNode reverseRec()
	{
		if (header == null)
			return null;
		return header.reverseRec(header);
	}

	public void print()
	{
		if (header == null)
		{
			return;
		}
		else
		{
			header.print(header);
		}

	}

	public int size()
	{
		return size;
	}

	public void delete(int data)
	{
		if (header == null)
			return;

		if (header.data == data)
		{
			header = header.next;
			header.prev = null;
			return;
		}
		else
		{
			DNode curr = header;
			while (curr.next != null)
			{
				if (curr.next.data == data)
				{
					curr.next = curr.next.next;
					curr.next.next.prev = curr;
					return;
				}
				curr = curr.next;
			}
		}

	}

}
