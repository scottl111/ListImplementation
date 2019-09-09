package test.java.listImplementation.scottl111.github;

import listImplementation.scottl111.github.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * TDD approach has been taken to this project, so started by writing the test class.
 *
 * Tests the functional elements of the list.
 */
public class ListTest
{

    /**
     * Test added a number of items to the list.
     */
    @Test
    public void testAddingToList()
    {
        List<String> testList = new List<>();

        testList.add("Hello");
        testList.add("World");
        testList.add("-");
        testList.add("How");
        testList.add("Are");
        testList.add("You?");

        Assert.assertTrue(testList.getSize() == 6);
        Assert.assertEquals(testList.get(0), "Hello");
        Assert.assertEquals(testList.get(1), "World");
        Assert.assertEquals(testList.get(2), "-");
        Assert.assertEquals(testList.get(3), "How");
        Assert.assertEquals(testList.get(4), "Are");
        Assert.assertEquals(testList.get(5), "You?");
    }

    /**
     * Test that the removal of an item from a list that has a size less than 0 throws an IndexOutOfBounds exception.
     */
    @Test
    public void testGettingFromListThatThrowsException()
    {
        List<String> testList = new List<>();

        boolean exceptionThrown = false;
        try
        {
            testList.get(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            exceptionThrown = true;
        }

        Assert.assertTrue(exceptionThrown);
    }

    /**
     * Test the removal of items from a list.
     */
    @Test
    public void testRemovingItemFromList()
    {
        //todo
    }

    /**
     * Tests the size method of the list
     */
    @Test
    public void testSizeOfList()
    {
        List<String> testList = new List<>();
        Assert.assertEquals(0, testList.getSize());

        testList.add("Hello");
        Assert.assertEquals(1, testList.getSize());

        testList.remove(0);
        Assert.assertEquals(0, testList.getSize());
    }

    /**
     * Tests the is empty method of the list.
     */
    @Test
    public void testEmptyList()
    {
        List<String> testList = new List<>();
        Assert.assertTrue(testList.isEmpty());

        testList.add("ABC");
        Assert.assertFalse(testList.isEmpty());

        testList.remove(0);
        Assert.assertTrue(testList.isEmpty());
    }

    /**
     * Tests that the list is generic.
     */
    @Test
    public void testListIsGeneric()
    {
        Object itemReturnedFromList;

        List<String> stringList = new List<>();
        stringList.add("String");
        itemReturnedFromList = stringList.get(0);
        Assert.assertTrue(itemReturnedFromList instanceof String);

        List<Integer> intList = new List<>();
        intList.add(444);
        itemReturnedFromList = intList.get(0);
        Assert.assertTrue(itemReturnedFromList instanceof Integer);

    }

    /**
     * Test that when too many items are added to the list than its default size, that the list handled it and doesn't
     * just throw an exception.
     */
    @Test
    public void addTestAddingTooManyValuesToList()
    {
        List<String> testList = new List<>();

        testList.add("Hello");
        testList.add("World");
        testList.add("-");
        testList.add("How");
        testList.add("Are");
        testList.add("You?");
        testList.add("...");
        testList.add("I'm");
        testList.add("Great");
        testList.add("Thank");
        testList.add("You");
        testList.add("For");
        testList.add("Asking");
    }
}
