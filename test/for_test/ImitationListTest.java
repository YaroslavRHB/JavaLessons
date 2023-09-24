package for_test;

import homeworks.august.hw_31_08_23.ImitationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.junit.contrib.java.lang.system.SystemOutRule;


public class ImitationListTest {
    private ImitationList list = new ImitationList(5);

    @Rule
    public SystemOutRule outRule = new SystemOutRule().enableLog();

    @Before
    public void clearArray() {
        list.setList(new int[3]);
    }

    @Test
    public void shouldAddElementToArrayValueIsNotZero() {
        list.addElement(5);
        list.addElement(7);

        int[] array = list.getList();

        Assert.assertEquals(5, array[0]);
        Assert.assertEquals(7, array[1]);
        Assert.assertArrayEquals(new int[]{5, 7, 0}, array);
    }

    @Test
    public void shouldAddElementToArrayValueIsZero() {
        list.addElement(0);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{0, 0, 0}, array);
    }

    @Test
    public void shouldResizeArray() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);

        int[] array = list.getList();

        Assert.assertEquals(6, array.length);
    }

    @Test
    public void shouldNotResizeArray() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        int[] array = list.getList();

        Assert.assertEquals(3, array.length);
    }

    @Test
    public void shouldChangeElementIfIndexLessThanZeroOrBiggerThanLength() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.changeElementByIndex(-1, 4);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldChangeElementIfValueEqualsZero() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.changeElementByIndex(1, 0);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldChangeElementIfEverythingIsCorrect() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.changeElementByIndex(1, 5);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 5, 3}, array);
    }

    @Test
    public void shouldDeleteElementWithIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.deleteElementByIndex(5);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldDeleteElementWithoutIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.deleteElementByIndex(2);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }

    @Test
    public void shouldIncreaseWithIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.increaseByIndex(0);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldIncreaseWithoutIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.increaseByIndex(1);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3, 0}, array);
    }

    @Test
    public void shouldDecreaseWithIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.decreaseByIndex(0);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldDecreaseWithoutIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.decreaseByIndex(1);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }

    @Test
    public void shouldIncreaseToFixSizeWithIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.increaseToFixedSize(-1);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldIncreaseToFixSizeWithoutIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.increaseToFixedSize(5);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3, 0, 0}, array);
    }

    @Test
    public void shouldDecreaseToFixSizeWithIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.decreaseToFixedSize(-1);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void shouldDecreaseToFixSizeWithoutIf() {
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);

        list.decreaseToFixedSize(2);

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }

    @Test
    public void shouldOutputInOrder(){
        list.addElement(1);
        list.addElement(5);
        list.addElement(3);

        list.outputInOrder();

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("1\t5\t3"));



    }

    @Test
    public void shouldSortBubble() {
        list.addElement(4);
        list.addElement(2);
        list.addElement(8);

        list.sortBubble();

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{2, 4, 8}, array);
    }

    @Test
    public void shouldAddArrayWithIf() {
        list.addElement(4);
        list.addElement(2);

        list.addArray(new int[]{6});

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{4, 2, 6}, array);
    }

    @Test
    public void shouldAddArrayWithoutIf() {
        list.addElement(4);
        list.addElement(2);
        list.addElement(5);

        list.addArray(new int[]{6, 7});

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{4, 2, 5, 6, 7}, array);
    }

    @Test
    public void shouldRemoveDuplicates() {
        list.addElement(4);
        list.addElement(2);
        list.addElement(5);
        list.addElement(3);
        list.addElement(5);

        list.removeDuplicates();

        int[] array = list.getList();

        Assert.assertArrayEquals(new int[]{4, 2, 3, 5, 0}, array);
    }



    @Test
    public void shouldSearchFirstEntry() {
        list.addElement(4);
        list.addElement(2);
        list.addElement(5);
        list.addElement(3);
        list.addElement(5);

        list.searchFirstEntry(2);

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("The first entry is: 1"));

    }

}
