import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(BlockJUnit4ClassRunner.class)
public class DeDupTest {

    private DeDup instance;

    @Before
    public void setUp() {
        instance = new DeDup();
        Assert.assertNotNull(instance.randomIntegers);
        assertDuplicateNumbers(instance.randomIntegers, true);
    }

    @Test
    public void testRemoveDuplicateEntriesUsingSet() {
        Integer[] uniqueNumbersArray = instance.removeDuplicateEntriesUsingSet();
        Assert.assertNotNull(uniqueNumbersArray);
        assertDuplicateNumbers(uniqueNumbersArray, false);
    }

    @Test
    public void testRemoveDuplicateEntriesUsingList() {
        Integer[] uniqueNumbersArray = instance.removeDuplicateEntriesUsingList();
        Assert.assertNotNull(uniqueNumbersArray);
        assertDuplicateNumbers(uniqueNumbersArray, false);
    }

    @Test
    public void testRemoveDuplicatesWithoutUsingCollections() {
        int[] uniqueNumbersArray = instance.removeDuplicatesWithoutUsingCollections();
        Assert.assertNotNull(uniqueNumbersArray);
        assertDuplicateNumbers(uniqueNumbersArray, false);
    }

    private void assertDuplicateNumbers(Integer[] randomIntegers, boolean expectedDuplicateNumberExists) {
        boolean duplicateNumberExists = false;
        List<Integer> numbersList = new ArrayList<>();

        for (int i : randomIntegers) {
            if (numbersList.contains(i))
                duplicateNumberExists = true;
            else
                numbersList.add(i);
        }
        Assert.assertEquals(expectedDuplicateNumberExists, duplicateNumberExists);
    }

    private void assertDuplicateNumbers(int[] randomIntegers, boolean expectedDuplicateNumberExists) {
        boolean duplicateNumberExists = false;
        List<Integer> numbersList = new ArrayList<>();

        for (int i : randomIntegers) {
            if (numbersList.contains(i))
                duplicateNumberExists = true;
            else
                numbersList.add(i);
        }
        Assert.assertEquals(expectedDuplicateNumberExists, duplicateNumberExists);
    }
}
