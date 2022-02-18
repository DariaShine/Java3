package lesson6;

public class ArrayWithOneFour {

    public static boolean isArrayContainsOneFour(int[] array) {
        boolean isContainOne = false;
        boolean isContainFour = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                isContainOne = true;
            };
            if(array[i] == 4){
                isContainFour = true;
            }
        };

        if(isContainOne && isContainFour){
            return true;
        }
        return false;
    };
}
