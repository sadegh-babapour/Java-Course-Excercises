public class ObjectArrayList
{
    private Point[] pointz;

    public ObjectArrayList (int size){
        if (size > 0)
            pointz = new Point [size];
    }

    public ObjectArrayList ()
    {
        pointz = new Point[0];
    }


    public void addElement (Point p) {
        if (pointz.length <1) {
            Point[] tempArr = new Point[pointz.length + 1];
            tempArr[0] = p;
            pointz = tempArr;
        } else {
            Point[] tempArr = new Point[pointz.length + 1];
            for (int index = 0; index < pointz.length; index++) {
                tempArr[index] = pointz[index];
            }
            tempArr[tempArr.length - 1] = p;
            pointz = tempArr;
        }
    }

//    @Override
//    public String toString () {
//        String strng = "[";
//
//        for (int i = 0; i < pointz.length; i++) {
//
//            if (i != pointz.length - 1) {
//                strng += pointz[i] + ",";
//            }
//            else {
//                strng += pointz[i];
//            }
//        }
//        strng += "]";
//        return strng;
//    }
    public void insertAt(int index, Point p) {
        if (index < pointz.length  && index > -1) {

            Point[] tempArr = new Point[pointz.length + 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = pointz[i];
            }
            for (int i = index; i < pointz.length; i++) {
                tempArr[i + 1] = pointz[i];
            }
            tempArr[index] = p;
            pointz = tempArr;
        }
        else {
            System.out.println("invalid index");
        }
    }
    public void removeAt(int index) {
        if (index < pointz.length  && index > -1) {
            Point[] tempArr = new Point[pointz.length - 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = pointz[i];
            }
            for (int i = index; i < pointz.length - 1; i++) {
                tempArr[i] = pointz[i + 1];
            }
            pointz = tempArr;
        }
        else {
            System.out.println("invalid index");
        }
    }
    public void resize(int length) {
        if (length >= pointz.length || length < 0) {
            System.out.println("invalid length!");
        } else {
            Point[] tempArr = new Point[length];
            for (int i = 0; i < length; i++) {
                tempArr[i] = pointz[i];
            }
            pointz = tempArr;
        }
    }
    // this part is already taken care of in the .toString override, but will implement it to satisfy the req.
    public void printElements(){
        String strng = "[";

        for (int i = 0; i < pointz.length; i++) {

            if (i != pointz.length - 1) {
                strng += pointz[i] + ", ";
            } else {
                strng += pointz[i];
            }
        }
        strng += "]";
        System.out.println(strng);
    }
}