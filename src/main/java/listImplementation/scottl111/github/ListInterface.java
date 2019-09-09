package main.java.listImplementation.scottl111.github;

/**
 * A list iterface
 *
 * @param <T> The type of item the list is of.
 */
public interface ListInterface<T>
{
    /**
     * Adds an item to the list.
     *
     * @param item The item to add
     */
    void add(T item);

    /**
     * Removes an item from the list.
     *
     * @param position The position to remove the item from.
     *
     * @return The item that has been removed.
     */
    T remove(int position);

    /**
     * Gets the item from the list. Does not remove the item from the list.
     *
     * @param position The position in the list to get the item from.
     *
     * @return The item from the given position within the list.
     */
    T get(int position);

    /**
     * Gets the size of the list.
     *
     * @return The size of the list.
     */
    int getSize();

    /**
     * Clears the list
     */
    void clear();

    /**
     * Determines if the list is empty or not.
     *
     *@return True if the list is empty, false if not.
     */
    boolean isEmpty();
}
