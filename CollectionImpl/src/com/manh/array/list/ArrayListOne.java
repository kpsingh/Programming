package com.manh.array.list;

import java.util.Arrays;

public class ArrayListOne
{
    private int size;

    private transient Object[] dataElement;

    public ArrayListOne(int initialCapacity)
    {
        super();

        dataElement = new Object[initialCapacity];

    }

    public ArrayListOne()
    {
        this(10);
    }

    /*
     * Method to add the elements
     */

    public boolean add(Object data)
    {
        ensureCapacity(size + 1);
        dataElement[size++] = data;
        return true;
    }

    /*
     * Method to add element based on the given index.
     */

    public void add(int index, Object data)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(dataElement, index, dataElement, index + 1, size - index);
        dataElement[index] = data;
        size++;

    }

    /*
     * Method to remove the element based on the given index.
     */
    public Object remove(int index)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
        Object oldElement = dataElement[index];

        int elementMoved = size - index - 1;

        System.arraycopy(dataElement, index + 1, dataElement, index, elementMoved);

        dataElement[--size] = null;

        return oldElement;
    }

    /*
     * this method will make sure to provide enough capacity to add the
     * elements.
     */

    public void ensureCapacity(int minCapacity)
    {
        int oldCapacity = dataElement.length;
        if (minCapacity > oldCapacity)
        {
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if (newCapacity < minCapacity)
            {
                newCapacity = minCapacity;
            }
            dataElement = Arrays.copyOf(dataElement, newCapacity);

        }
    }

    /*
     * Method to replce the element in the specified index
     */
    public void set(int index, Object data)
    {
        if (index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object oldData = dataElement[index];
        dataElement[index] = data;

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
