package soluctions;

import org.junit.Test;

import br.com.soupaulodev.soluctions.TwoSum;

import static org.junit.Assert.assertArrayEquals;


public class TestTwoSum {

    @Test
    public void testValidPair() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.execute(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testNoValidPair() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 3;
        int[] result = twoSum.execute(nums, target);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testEmptyInputArray() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {};
        int target = 5;
        int[] result = twoSum.execute(nums, target);
        assertArrayEquals(new int[]{}, result);
    }
}