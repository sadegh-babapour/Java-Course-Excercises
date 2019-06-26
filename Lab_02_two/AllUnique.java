public class AllUnique {

    public static boolean unique(int[] arr) {
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {

            for (j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {4, 6, 8, 1,11,3,6};
        int[] arr2 = {1, 3, 7, 5,8};
        boolean value = unique(arr1);
        System.out.println("arr1 is unique " + value);
        value = unique(arr2);
        System.out.println("arr2 is unique " + value);
    }
}