package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {6, 2, 8, 3, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 6, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 4, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }
}
