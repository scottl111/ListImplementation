package test.java.listImplementation.scottl111.github;

import main.java.listImplementation.scottl111.github.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * TDD approach has been taken to this project, so started by writing the test class.
 *
 * Tests the functional elements of the list.
 */
public class ListTest {

    /**
     * Test added a number of items to the list.
     */
    @Test
    public void testAddingToList() {
        List<String> testList = new List<>();

        testList.add("Hello");
        testList.add("World");
        testList.add("-");
        testList.add("How");
        testList.add("Are");
        testList.add("You?");

        Assert.assertEquals(6, testList.getSize());

        Assert.assertEquals("Hello", testList.get(0));
        Assert.assertEquals("World", testList.get(1));
        Assert.assertEquals("-", testList.get(2));
        Assert.assertEquals("How", testList.get(3));
        Assert.assertEquals("Are", testList.get(4));
        Assert.assertEquals("You?", testList.get(5));
    }

    /**
     * Test the getting of an item from a list that has a size less than 0 throws an IndexOutOfBounds exception.
     */
    @Test
    public void testGettingFromListWherePositionIsNegative() {
        List<String> testList = new List<>();

        boolean exceptionThrown = false;
        try {
            testList.get(-1);
        } catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }

        Assert.assertTrue(exceptionThrown);
    }

    /**
     * Test the getting of an item from a list that has a size less than 0 throws an IndexOutOfBounds exception.
     */
    @Test
    public void testGettingFromListWherePositionIsTooHigh() {
        List<String> testList = new List<>();

        boolean exceptionThrown = false;
        try {
            testList.get(0);
        } catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }

        Assert.assertTrue(exceptionThrown);
    }

    /**
     * Test the removal of items from a list.
     */
    @Test
    public void testRemovingItemFromList() {
        //todo
    }

    /**
     * Tests the size method of the list
     */
    @Test
    public void testSizeOfList() {
        List<String> testList = new List<>();
        Assert.assertEquals(0, testList.getSize());

        testList.add("Hello");
        Assert.assertEquals(1, testList.getSize());

        testList.remove(0);
        Assert.assertEquals(0, testList.getSize());

        for (int i = 0; i < 20; i++) {
            testList.add("Item " + i);
        }

        Assert.assertEquals(20, testList.getSize());
    }

    /**
     * Tests the is empty method of the list.
     */
    @Test
    public void testEmptyList() {
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
    public void testListIsGeneric() {
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
    public void addTestAddingTooManyValuesToList() {
        List<String> testList = new List<>();

        testList.add("0");
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");
        testList.add("6");
        testList.add("7");
        testList.add("8");
        testList.add("9");
        testList.add("10");
        testList.add("11");
        testList.add("12");

        Assert.assertEquals(13, testList.getSize());

        Assert.assertEquals("0", testList.get(0));
        Assert.assertEquals("1", testList.get(1));
        Assert.assertEquals("2", testList.get(2));
        Assert.assertEquals("3", testList.get(3));
        Assert.assertEquals("4", testList.get(4));
        Assert.assertEquals("5", testList.get(5));
        Assert.assertEquals("6", testList.get(6));
        Assert.assertEquals("7", testList.get(7));
        Assert.assertEquals("8", testList.get(8));
        Assert.assertEquals("9", testList.get(9));
        Assert.assertEquals("10", testList.get(10));
        Assert.assertEquals("11", testList.get(11));
        Assert.assertEquals("12", testList.get(12));
    }

    @Test
    public void testAddingPastDefaultListSizeAndRemovingItems() {
        List<String> testList = new List<>();

        testList.add("0");
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");
        testList.add("6");
        testList.add("7");
        testList.add("8");
        testList.add("9");
        testList.add("10");
        testList.add("11");
        testList.add("12");

        testList.remove(0);
        testList.remove(1);
        testList.remove(2);
        testList.remove(3);

        Assert.assertEquals(9, testList.getSize());
    }
}
