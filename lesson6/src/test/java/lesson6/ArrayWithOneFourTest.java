package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithOneFourTest {

    @Test
    public void test1ArrayWithOneFour() {
        Assertions.assertTrue(ArrayWithOneFour.isArrayContainsOneFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void test2ArrayWithOneFour() {
        Assertions.assertFalse(ArrayWithOneFour.isArrayContainsOneFour(new int[]{5, 2, 5, 5, 2, 3, 4, 7, 7}));
    }

    @Test
    public void test3ArrayWithOneFour() {
        Assertions.assertFalse(ArrayWithOneFour.isArrayContainsOneFour(new int[]{1, 2, 5, 5, 2, 3, 5, 7, 7}));
    }

    @Test
    public void test4ArrayWithOneFour() {
        Assertions.assertFalse(ArrayWithOneFour.isArrayContainsOneFour(new int[]{0, 2, 5, 5, 2, 3, 5, 7, 7}));
    }

}