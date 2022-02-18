package lesson6;

import java.util.Arrays;

public class ArrayClassWithFour{

    public static int[] newArrayFromOld(int[] array) {
        for (int i = array.length -1; i >= 0 ; i--) {
             if (array[i] == 4){
                 System.out.println(Arrays.toString(Arrays.copyOfRange(array,i+1, array.length)));
                return Arrays.copyOfRange(array,i+1, array.length);
            }
        }
        throw new RuntimeException("Массив не содержит 4");
    }
}

