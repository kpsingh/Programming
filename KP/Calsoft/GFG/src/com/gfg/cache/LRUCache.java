package com.gfg.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	private final int capacity;
	LinkedHashMap<Integer, Boolean> lruQ;

	public LRUCache(int cap) {
		this.capacity = cap;
		lruQ = new LinkedHashMap<Integer, Boolean>(capacity, 1.0f, true) {
			protected boolean removeEldestEntry(
					java.util.Map.Entry<Integer, Boolean> eldest)
			{
				return this.size() > capacity;
			}
		};

	}

	public void addPageNo(int page)
	{
		lruQ.put(page, true);
		dispayLRUQueue();
	}

	public void deletePageNo(int page)
	{
		if (isPageInLRU(page))
		{
			lruQ.remove(page);
			dispayLRUQueue();
		}
	}

	public boolean isPageInLRU(int page)
	{
		return lruQ.get(page) != null;
	}

	private void dispayLRUQueue()
	{

		for (Map.Entry<Integer, Boolean> entry : lruQ.entrySet())
		{
			System.out.print(entry.getKey() + ", ");
		}
		System.out.println();

	}

	public static void main(String[] args)
	{
		LRUCache lru = new LRUCache(4);

		lru.addPageNo(5);
		lru.addPageNo(4);
		lru.addPageNo(3);
		lru.addPageNo(2);
		lru.addPageNo(1);
		lru.addPageNo(6);

		System.out.println("");
		lru.deletePageNo(3);
		lru.deletePageNo(4);
		System.out.println("");

		lru.addPageNo(7);
		lru.addPageNo(8);
		lru.addPageNo(9);
	}
}
