package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object arr[] = {"cat", "dog", "cow", "horse", "coat"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);
        Object arrayList = arrayToArrList(arr);
        System.out.println(arrayList.toString());

    }

    public static void swap(Object arr[], int first, int second){
        Object x = arr[first];
        arr[first] = arr[second];
        arr[second] = x;
        System.out.println(Arrays.toString(arr));
    }

    public static <T> ArrayList<T> arrayToArrList(T arr[]){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
