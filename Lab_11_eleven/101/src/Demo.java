public class Demo {
    public static void main(String[] arg)
    {
        StudentLinkedList myHead = new StudentLinkedList();

//        System.out.println(myHead.head);

        myHead.insertToFrontofList(new Student ("Sam", 2));
        myHead.insertToFrontofList(new Student ("Sam", 8));
        myHead.insertToFrontofList(new Student ("Sam", 1));
        myHead.insertToFrontofList(new Student ("Sam", 17));
//        myHead.insertToFrontofList(new Student ("Sam", 4));

//        System.out.println(myHead.head);
//        System.out.println(myHead.head.getNext());

        myHead.insertToEnd(new Student ("aa", 5));
        myHead.insertToEnd(new Student ("bb", 7));
//        myHead.insertToEnd(new Student ("cc", 3));
//        myHead.insertInOrder(new Student ("Joe", 9));
////        myHead.insertToEnd(new Student ("dd", 12));
//        myHead.insertToEnd(new Student ("Sarah", 9));
//        myHead.insertToEnd(new Student ("Sarahdddd", 8));

//

//        myHead.printLinkedList();

//        myHead.insertInOrder(new Student ("Joe", 19));
//        myHead.insertInOrder(new Student ("moe", 23));
////        myHead.insertInOrder(new Student ("hoe", 7));
//        myHead.insertInOrder(new Student ("Joe", 4));
//        myHead.insertInOrder(new Student ("dee", 2));
//        myHead.insertInOrder(new Student ("vee", 7));
//        myHead.search(8);
//        System.out.println();
        myHead.printLinkedList();
        System.out.println("########################");
//        System.out.println(myHead);
//        myHead.mySort();
//        StudentLinkedList jj = new Sort(myHead).getSorted();
//        jj.printLinkedList();
//        myHead.insertInOrder(new Student ("aa", 2));
        System.out.println("Removing element with id 2");
        myHead.removeElement(2);
        myHead.printLinkedList();
        System.out.println("removing first element");
        myHead.removeFirstElement();
        myHead.printLinkedList();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
//        myHead.removeFirstElement();
        System.out.println("removing last element");
        myHead.removeEndElement();
//        myHead.printLinkedList();
//        myHead.removeEndElement();
//        myHead.removeEndElement();
//        myHead.removeElement();
//        myHead.removeElement(19);
//        System.out.println();
        myHead.printLinkedList();
//        myHead.recurPrint(myHead.getHead());
        System.out.println("==================");
        System.out.println("This section tests the insert in order,");
        System.out.println("insert inorder only works when linkedlist is sorted");
        StudentLinkedList myList = new StudentLinkedList();
        Student sam = new Student("Sam", 14);
        Student ham = new Student("Ham", 7);
        Student kam = new Student("Kam", 5);
        Student ram = new Student("Ram", 12);
        Student bam = new Student("Bam", 11);

        myList.insertInOrder(sam);
        myList.insertInOrder(ham);
        myList.insertInOrder(kam);
        myList.insertInOrder(ram);
        myList.insertInOrder(bam);

        myList.printLinkedList();
//        myList.removeFirstElement();
//        myList.printLinkedList();
//        myHead.mySort();
//        myHead.printLinkedList();
    }
}
