import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        Arrays.sort(array);
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {return array[0]+1;}
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] == 1) {}
            else {return array[i-1] + 1;}
        }
        return array[0]-1;
    }

    public static int secondMaxValue(int [] array) {
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {return array[0];}
        int firstMaxValue = array[0], secondMaxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > secondMaxValue) {
                secondMaxValue = array[i];
            }

            if (array[i] > firstMaxValue) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = array[i];
                
            }

        }

        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean notEqual = true;
        for (int i = 0; i < array1.length; i++) {
            notEqual = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {notEqual=false;break;}
            }
            if (notEqual) {return false;}
        }
        for (int i = 0; i < array2.length; i++) {
            notEqual = true;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == array2[i]) {notEqual=false;break;}
            }
            if (notEqual) {return false;}
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted1 = true;
        boolean sorted2 = true;
        // sorted from small to big
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] > array[i-1])) {sorted1 = false;}
        }
        // sorted from big to small
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] < array[i-1])) {sorted2 = false;}
        }

        return sorted1 || sorted2;
    }

}
