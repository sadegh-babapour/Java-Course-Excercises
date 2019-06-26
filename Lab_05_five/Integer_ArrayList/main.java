public class main {
    public static void main (String [] args) {
        IntArrayList ar = new IntArrayList ();

        ar.addElement (2);
//        System.out.println(ar.toString());
        ar.addElement (4);
//        System.out.println(ar.toString());
        ar.addElement (6);
//        System.out.println(ar.toString());
        ar.addElement (8);
//        System.out.println(ar.toString());
        ar.insertAt (2, 5); //inserting number 5 at index 2
//        System.out.println(ar.toString());
        ar.insertAt (2, 5); //inserting number 5 at index 2
//        System.out.println(ar.toString());
        ar.printElements();
        ar.removeAt (1);    //remove the element at index 1
//        System.out.println(ar.toString());
        ar.removeAt (1);    //remove the element at index 1
//        System.out.println(ar.toString());
        ar.resize (2);       //the new size of the array will be 2 elements
//        System.out.println(ar.toString());
        ar.printElements();    //This should print all elements in the array
    }
}
