import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        Arrays.sort(array);
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {System.out.println(array[0]); return -1;}
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] == 1) {}
            else {System.out.println(array[i-1] + 1); break;}
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        if (array.length == 0) {return -1;}
        else if (array.length == 1) {System.out.println(array[0]); return -1;}
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
        System.out.println(secondMaxValue);
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
