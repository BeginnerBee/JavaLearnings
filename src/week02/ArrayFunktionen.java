package week02;

import java.util.Arrays;

public class ArrayFunktionen {

    public static void main(String[] args) {

        int[] array1 = {23, 22, 24, 21};
        int[] array2 = {65, 57, 48, 32};
        int[] array3 = {33, 32, 31, 34};
        int[] array4 = {52, 53, 54, 55};
        int[] array5 = {12, 13, 11, 14};

        System.out.println("reverted arrays:");
        print(array1.clone(), revert(array1.clone()));
        print(array2.clone(), revert(array2.clone()));
        print(array3.clone(), revert(array3.clone()));
        print(array4.clone(), revert(array4.clone()));
        print(array5.clone(), revert(array5.clone()));

        System.out.println("ascendingly sorted?");
        System.out.println(Arrays.toString(array1) + "\t" + ascendinglySorted(array1));
        System.out.println(Arrays.toString(array2) + "\t" + ascendinglySorted(array2));
        System.out.println(Arrays.toString(array3) + "\t" + ascendinglySorted(array3));
        System.out.println(Arrays.toString(array4) + "\t" + ascendinglySorted(array4));
        System.out.println(Arrays.toString(array5) + "\t" + ascendinglySorted(array5));

        System.out.println("descendingly sorted?");
        System.out.println(Arrays.toString(array1) + "\t" + descendinglySorted(array1));
        System.out.println(Arrays.toString(array2) + "\t" + descendinglySorted(array2));
        System.out.println(Arrays.toString(array3) + "\t" + descendinglySorted(array3));
        System.out.println(Arrays.toString(array4) + "\t" + descendinglySorted(array4));
        System.out.println(Arrays.toString(array5) + "\t" + descendinglySorted(array5));

    }

    public static int[] revert(int[] intArray) {
        for (int i = 0; i < (int) Math.ceil((double) intArray.length / 2); i++) {
            int temp = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = intArray[i];
            intArray[i] = temp;
        }
        return intArray;
    }

    public static boolean ascendinglySorted(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++)
            if (intArray[i] > intArray[i + 1])
                return false;
        return true;
    }


    public static boolean descendinglySorted(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++)
            if (intArray[i] < intArray[i + 1])
                return false;
        return true;
    }

    public static void print(int[]... intArrays) {
        StringBuilder st = new StringBuilder();
        for (int[] intArray : intArrays) {
            st.append("[");
            for (int item : intArray)
                st.append(item).append(", ");
            st.deleteCharAt(st.lastIndexOf(",")).deleteCharAt(st.lastIndexOf(" ")).append("] - ");
        }
        st.deleteCharAt(st.lastIndexOf("-"));
        System.out.println(st);
    }
}
