/**
 * Sawpping array Elements.
 * @Sadegh_Babapour
 */


public class SawpArrays {
    public static void swap(float[] arr1,float[] arr2){
        int i;
        float [] t = new float[arr1.length];
        if (arr1.length != arr2.length) {
            System.out.println("The arrays should have same length!");
        }
        else {
            for (i = 0; i< arr1.length; i++) {
                t[i] = arr2[i];
                arr2[i] =arr1[i];
                arr1[i] = t[i];

            }

        }

    }
    public static void main(String[] args) {
        float[] arr1 = {5, 6, 7, 8, 9};
        float[] arr2 = {15, 16, 17, 18, 19};
        swap(arr1, arr2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("array 1 is " + arr1[i]);
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("array 2 is " + arr2[i]);
        }
    }
}
