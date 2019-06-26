/**
 * Question 1: answer, Inserting a value at a specified index.
 * @ Sadegh Babapour
 */

public class ArrayFunk {
    public static float[] insertAt(float [] array, float value, int index1) {
        float[] placeholder = new float[array.length + 1];
        if (index1 > array.length) {
            System.out.println("Can not be greater than array length");

        } else if (index1 < 0) {
            System.out.println(" Can not be less than 0");
        }
        else {

            int i;

            for (i = 0; i < index1; i++) {
                placeholder[i] = array[i];
            }
            placeholder[index1] = value;
            int j;
            for (j = index1+1; j < array.length + 1; j++) {
                placeholder[j] = array[j - 1];
            }

        }
        System.out.println("sfdsgdh");
        return placeholder;
    }

    public static void main(String[] args){
        float [] arr = {5.0f, 144.0f, 68.0f, 666.0f, 789.0f, 924.0f, 124.0f, 635.0f};
        float val = 2018.0f;
        int index = 8;
        arr = insertAt(arr,val,index);
        for (int k=0; k < arr.length; k++)
        System.out.println(arr[k]);


    }
}
