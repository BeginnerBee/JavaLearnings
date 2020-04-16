package week02;

public class VarargsTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3,4,5};

        varArgsTest(a, b);
    }

    public static void varArgsTest(int[]... array) {
        System.out.println(array.length);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }



}
