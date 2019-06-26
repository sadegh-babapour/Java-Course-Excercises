public class StudentLinkedList {

    private Student head;

    public StudentLinkedList() {

        head = null;
    }

    public void insertToFrontofList(Student s) {
        if (head == null) {
            this.head = s;
        } else {

            s.setNext(head);
            head = s;
        }
    }

    public void printLinkedList() {
        System.out.println("\nThe list:");
        Student cursor = head;
        while (cursor != null) {
            System.out.println(cursor.toString());
            cursor = cursor.getNext();
        }
    }

    public void insertToEnd(Student s) {
        Student cursor = head;
        if (head == null) {
            head = s;
            return;
        }
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.setNext(s);
    }

    public void insertInOrder(Student s) {
        if (head == null) {
            head = s;
        } else if (s.getId() == head.getId()) {
            return;

        } else if (s.getId() < head.getId()) {
            insertToFrontofList(s);
        } else {
            Student c2 = head;
            Student c1 = head;
            while (c2.getNext() != null) {
                c1 = c2;
                c2 = c2.getNext();

                if (s.getId() < c2.getId()) {
                    c1.setNext(s);
                    s.setNext(c2);
                    return;
                } else if (s.getId() == c2.getId()) {
                    return;
                }
            }
            insertToEnd(s);
        }
    }


    public Student search(int id) {
        if (head == null) {
            System.out.println("The id not found!, list is empty");
            return null;
        } else if (head.getId() == id) {

            System.out.println("Found it, it's first element");
            System.out.println(head.toString());
            return head;
        }

        Student cur = head;
        while (cur.getNext() != null) {
            if (cur.getId() == id) {
                System.out.println("Found it!!");
                System.out.println(cur.toString());
                return cur;
            }

            cur = cur.getNext();

        }
        if (cur.getId() == id) {
            System.out.println("Found it!, it is the last element");
            System.out.println(cur.toString());
            return cur;
        }
        System.out.println("not found !!");
        return null;
    }


    public void removeElement(int id) {

        if (head == null) {
            return;
        } else if (head.getId() == id) {
            head = head.getNext();
            return;
        }
        else if (search(id) == null){
            return;
        }
        else {
            Student c1 = head;
            Student c2 = head;
            while (c2 != null) {
                c1 = c2;
                c2 = c2.getNext();
                if (id == c2.getId()) {
//                c2.setNext(c2.getNext());
                    c1.setNext(c2.getNext());
//                c2.setNext(c2.getNext());
                    return;
                }

            }
        }

    }


    public void removeFirstElement(){
        if (head == null){
            return;
        }

        head = head.getNext();
        return;
    }

    public void removeEndElement(){
        if (head == null){
            return;
        }
        else if (head.getNext() == null){
            head = null;
            return;
        }
        Student c = head;
        Student c2 = head;
        while(c2.getNext() != null){
            c = c2;
            c2 = c2.getNext();
            if (c2.getNext() == null){
                c.setNext(null);
                return;
            }
        }
    }


    public Student getHead(){
        return this.head;
    }


}

//public class StudentLinkedList
//{
//
//    private Student head;
//
//    public StudentLinkedList ()
//    {
//
//        head = null;
//    }
//    public void insertToFrontofList (Student s)
//    {
//        if (head == null) {
//            this.head = s;
//        }
//        else{
//
//            s.setNext(head);
//            head = s;
//        }
//    }
//
//    public void printLinkedList ()
//    {
//        Student cursor = head;
//        while(cursor != null)
//        {
//            System.out.println(cursor.toString());
//            cursor = cursor.getNext();
//        }
//    }
//
//    public void insertToEnd(Student s)
//    {
//        Student cursor = head;
//        if (head == null) {
//            head = s;
//            return;
//        }
//        while (cursor.getNext() != null) {
//            cursor = cursor.getNext();
//        }
//        cursor.setNext(s);
//    }
//
//    public void insertInOrder (Student s)
//    {
//        if (head == null)
//        {
//            head = s;
//        }
//        else if (s.getId() < head.getId())
//        {
//            insertToFrontofList(s);
//        }
//        else{
//            Student c2 = head;
//            Student c1 = head;
//            while (c2.getNext() != null)
//            {
//                c1 = c2;
//                c2= c2.getNext();
//                if (s.getId() < c2.getId()){
//                    c1.setNext(s);
//                    s.setNext(c2);
//                    return;
//                }
//            }
//            insertToEnd(s);
//        }
//
//
//    }
//
//
//    public static void recurPrint(Student s) {
//        if (s == null){return;}
//        else{
//            recurPrint(s.getNext());
//        }
//    }
//
//    public Student getHead(){
//
//        return this.head;
//    }
//
//}

//    public static void recurPrint(Student s) {
//        if (s == null){return;}
//        else{
//            recurPrint(s.getNext());
//        }
//    }

