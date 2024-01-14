import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        Arrays.sort(array);
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {return array[0];}
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] == 1) {}
            else {return array[i-1] + 1;}
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {return array[0];}
        int firstMaxValue = array[0], secondMaxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstMaxValue) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = array[i];
                
            }
            if (array[i] > secondMaxValue) {
                secondMaxValue = array[i];
            }
        }

        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.asList(array2).contains(array1[i])) {return false;}
        }
        for (int i = 0; i < array2.length; i++) {
            if (!Arrays.asList(array1).contains(array2[i])) {return false;}
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] < array[i]) {return false;}
        }
        return true;
    }

}
