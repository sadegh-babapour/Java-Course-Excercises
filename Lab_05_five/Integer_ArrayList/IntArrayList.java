public class IntArrayList
{
    private int [] array;
    public IntArrayList (int size){
        if (size > 0)
            array = new int [size];
    }

    public IntArrayList ()
    {
        array = new int[0];
    }

    public void addElement (int x) {
        if (array.length <1) {
            int[] tempArr = new int[array.length + 1];
            tempArr[0] = x;
            array = tempArr;
        } else {
            int[] tempArr = new int[array.length + 1];
            for (int index = 0; index < array.length; index++) {
                tempArr[index] = array[index];
            }
            tempArr[tempArr.length - 1] = x;
            array = tempArr;
        }
    }

        @Override
        public String toString () {
            String strng = "[";

            for (int i = 0; i < array.length; i++) {

                if (i != array.length - 1) {
                    strng += array[i] + ",";
                }
                else {
                    strng += array[i];
                }
            }
            strng += "]";
            return strng;
    }
    public void insertAt(int index, int value) {
        if (index < array.length  && index > -1) {

            int[] tempArr = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = array[i];
            }
            for (int i = index; i < array.length; i++) {
                tempArr[i + 1] = array[i];
            }
            tempArr[index] = value;
            array = tempArr;
        }
        else {
            System.out.println("invalid index");
        }
    }
    public void removeAt(int index) {
        if (index < array.length  && index > -1) {
            int[] tempArr = new int[array.length - 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = array[i];
            }
            for (int i = index; i < array.length - 1; i++) {
                tempArr[i] = array[i + 1];
            }
            array = tempArr;
        }
        else {
            System.out.println("invalid index");
        }
    }
    public void resize(int length) {
        if (length >= array.length || length < 0) {
            System.out.println("invalid length!");
        } else {
            int[] tempArr = new int[length];
            for (int i = 0; i < length; i++) {
                tempArr[i] = array[i];
            }
            array = tempArr;
        }
    }
    // this part is already taken care of in the .toString override, but will implement it to satisfy the req.
    public void printElements(){
        String strng = "[";

        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) {
                strng += array[i] + ",";
            } else {
                strng += array[i];
            }
        }
        strng += "]";
        System.out.println(strng);
    }
}




// and printElements
