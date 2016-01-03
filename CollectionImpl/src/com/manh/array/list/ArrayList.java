package com.manh.array.list;

import java.util.Arrays;

public class ArrayList
{

    private int size;

    private transient Object[] dataElement;

    public ArrayList(int initialCapacity)
    {
        super();
        dataElement = new Object[initialCapacity];
    }

    public ArrayList()
    {
        this(10);
    }

    public boolean add(Object data)
    {
        ensureCapacity(size + 1);
        dataElement[size++] = data;
        return true;
    }

    public boolean add(int index, Object data)
    {
        if (index > size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        ensureCapacity(size + 1);

        System.arraycopy(dataElement, index, dataElement, index + 1, size - index);

        dataElement[index] = data;
        size++;

        return true;

    }

    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity = dataElement.length;

        if (minCapacity > oldCapacity)
        {
            int newCapacity = oldCapacity * 2;
            System.out.println("Capacity got increased to : " + newCapacity);

            if (newCapacity < minCapacity)
            {
                newCapacity = minCapacity;

            }
            dataElement = Arrays.copyOf(dataElement, newCapacity);
        }

    }

    public Object remove(int index)
    {
        if (index > size)
        {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object oldData = dataElement[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
        {
            System.out.println("Num Moved : " + numMoved);
            // Use this when you are shifting the arrays in same, but of you
            // need to create a new array them use Arrays.copy method.
            System.arraycopy(dataElement, index + 1, dataElement, index, numMoved);
        }

        dataElement[--size] = null;

        return oldData;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < dataElement.length; i++)
        {
            sb.append(dataElement[i] + ",");
        }

        sb.append("]");
        return sb.toString();
    }

}
