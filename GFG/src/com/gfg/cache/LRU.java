package com.gfg.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
	private final int capacity;
	private LinkedHashMap<Integer, Boolean> lruQ;

	public LRU(int cap) {
		this.capacity = cap;
		lruQ = new LinkedHashMap<Integer, Boolean>(capacity, 1.0f, true) {
			protected boolean removeEldestEntry(
					java.util.Map.Entry<Integer, Boolean> eldest)
			{
				return this.size() > capacity;
			}
		};

	}

	public void addPage(int page)
	{
		lruQ.put(page, true);
		displayLRUQ();
	}

	public boolean isPageInLRU(int page)
	{
		return lruQ.get(page) != null;
	}

	public void removePage(int page)
	{
		if (isPageInLRU(page))
		{
			lruQ.remove(page);
			displayLRUQ();
		}
	}

	private void displayLRUQ()
	{
		for (Map.Entry<Integer, Boolean> entry : lruQ.entrySet())
		{
			System.out.print(entry.getKey() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		LRU lru = new LRU(4);
		lru.addPage(1);
		lru.addPage(2);
		lru.addPage(3);
		lru.addPage(4);

		lru.addPage(5);
		lru.addPage(6);

		lru.removePage(2);
		lru.removePage(6);

		lru.addPage(9);
		lru.addPage(10);
	}

}
