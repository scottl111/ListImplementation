package main.java.listImplementation.scottl111.github;

/**
 * My own implementation of a list. Similar to an array list but my own implementation without using any external libraries
 *
 * @param <T> The type of the list.
 */
public class List<T> implements ListInterface
{

    /**
     * The array of items within the list
     */
    private Object [] list;

    /**
     * The size of the list
     */
    private int size = 0;

    /**
     * Creates a new list with a default size of 10.
     */
    public List()
    {
        list = new Object [10];
    }

    /**
     * Adds a new item to the list
     *
     * @param item The item to add to the list
     */
    @Override
    public void add(Object item)
    {
        if (size == list.length)
        {
            Object [] itemInListCurrently = deepCopy();
            list = new Object[size * 2];

            System.arraycopy(itemInListCurrently, 0, list, 0, size);
        }

        list[size++] = item;
    }

    /**
     * Gets the item at a given position within the list, or null if nothing is present within the list.
     *
     * @param position the position of the item to get from the list.
     * @return The item at the given position within the list.
     */
    public T get(int position)
    {
        if (position >= size || position < 0)
        {
            throw new IndexOutOfBoundsException("Item is out of bounds of the list");
        }

        return (T) list[position];
    }

    /**
     * Removes an item from the list at the given position and returns the item.
     *
     * @param position The position to remove the item from within the list.
     * @return The item within the list.
     */
    public T remove(int position)
    {
        if (position >= size || position < 0)
        {
            throw new IndexOutOfBoundsException("Item is out of bounds of the list");
        }

        Object theItem = list[position];
        list[position] = null;
        list = deepCopy();

        size--;
        return (T) theItem;
    }

    /**
     * Workaround at the moment. Creates a deep copy of the list.
     *
     * @return A deep copy of the list.
     */
    private Object[] deepCopy()
    {
        Object[] newList = new Object[size];

        int newListPosition = 0;
        for (int i =0; i < size; i++)
        {
            if (list[i] != null)
            {
                newList[newListPosition++] = list[i];
            }
        }

        return newList;
    }

    /**
     * Gets the size of the list.
     *
     * @return The size of the list
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Clears the list
     */
    @Override
    public void clear()
    {
        list = new Object[10];
    }

    /**
     * Returns true if the list is empty or false if not.
     *
     * @return True if the list is empty, false if not
     */
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    /**
     * To string of the items within the list
     *
     * @return A string of all the of the items within the list
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (Object item : list)
        {
            builder.append(item.toString());
            builder.append(", ");
        }
        builder.append(']');
        return builder.toString();
    }
}