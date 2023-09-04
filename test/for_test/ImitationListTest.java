package for_test;

import homeworks.hw_31_08_23.ImitationList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImitationListTest {
    private ImitationList list = new ImitationList(5);

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
}
