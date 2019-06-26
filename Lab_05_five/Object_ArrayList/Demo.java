public class Demo {
    public static void main(String[] args) {

        ObjectArrayList arr = new ObjectArrayList();

        Point p1 = new Point(2, 40, "p1");
        arr.addElement(p1);
        Point p2 = new Point(4, 35, "p2");
        arr.addElement(p2);
        Point p3 = new Point(6, 30, "p3");
        arr.addElement(p3);
        Point p4 = new Point(8, 25, "p4");
        arr.addElement(p4);
        Point p5 = new Point(10, 20, "p5");
        arr.addElement(p5);
        Point p6 = new Point(12, 15, "p6");
        arr.addElement(p6);
        arr.printElements();

        Point p7 = new Point(444, 555, "JJ");
        arr.insertAt (3, p7); //inserting number 5 at index 2
        arr.printElements();

        Point p8 = new Point(11, 111, "kk");
        arr.insertAt (6, p8); //inserting number 5 at index 2
        arr.printElements();
        arr.removeAt (1);    //remove the element at index 1
        arr.printElements();
        arr.resize (2);       //the new size of the array will be 2 elements
        arr.printElements();
//        arr.printElements();    //This should print all elements in th

    }
}
