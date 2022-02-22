package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWithFourTest {
    @Test
    public void test1NewArray() {
        Assertions.assertArrayEquals(new int[]{1, 7}, ArrayClassWithFour.newArrayFromOld(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void test2NewArray() {
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ArrayClassWithFour.newArrayFromOld(new int[]{1, 2, 1, 7});
            }
        });
    }

    @Test
    public void test3NewArray() {
        Assertions.assertArrayEquals(new int[]{}, ArrayClassWithFour.newArrayFromOld(new int[]{1, 2, 1, 4}));
    }

}