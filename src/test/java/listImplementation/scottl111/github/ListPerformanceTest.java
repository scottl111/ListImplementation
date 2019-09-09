package test.java.listImplementation.scottl111.github;

import main.java.listImplementation.scottl111.github.List;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

public class ListPerformanceTest {

    private static final int ADD_ITERATIONS = 500000;

    private double getTimeTakenToAddItemsToMyList() {
        List<String> testList = new List<>();

        Long startTime = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < ADD_ITERATIONS; i++) {
            testList.add("Item " + i);
        }

        Long endTime = Calendar.getInstance().getTimeInMillis();

        return (endTime - startTime);
    }


    private double getTimeTakenToAddItemsToJavaList() {
        ArrayList<String> testList = new ArrayList<>();

        Long startTime = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < ADD_ITERATIONS; i++) {
            testList.add("Item " + i);
        }

        Long endTime = Calendar.getInstance().getTimeInMillis();

        return (endTime - startTime);
    }

    @Test
    public void ensurePerformanceBetweenLibraries() {

        double timeTakenForJava = getTimeTakenToAddItemsToJavaList();
        double timeTakenMyList = getTimeTakenToAddItemsToMyList();

        // Use a delta of 1 second (10000 milliseconds) between the libraries
        Assert.assertEquals(timeTakenMyList, timeTakenForJava, 1000);
    }
}
