package com.manh.array.list;

import java.util.Arrays;

public class ArrayListTwo
{
    private int size = 0;

    private Object[] dataElement = null;

    public ArrayListTwo(int initicalCapacity)
    {
        dataElement = new Object[initicalCapacity];
    }

    public ArrayListTwo()
    {
        this(10);
    }

    public boolean add(Object data)
    {
        ensureCapacity(size + 1);
        dataElement[size++] = data;
        return true;

    }

    public void add(int index, Object data)
    {
        if (index > size)
            throw new ArrayIndexOutOfBoundsException("Index : " + index + ", Size : " + size);

        System.arraycopy(dataElement, index, dataElement, index + 1, size - index);
        dataElement[index] = data;
        size++;

    }

    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity = dataElement.length;
        if (minCapacity > oldCapacity)
        {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
            {
                newCapacity = minCapacity;
            }
            dataElement = Arrays.copyOf(dataElement, newCapacity);
        }
    }
}
