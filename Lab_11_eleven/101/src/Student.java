public class Student
{
    private int id;
    private String name;
    private Student next;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        next = null;
    }

    public Student getNext() {
        return next;
    }

    public String toString()
    {
        return  "Name " + name + " ID " + id;
    }

    public void setNext(Student s) {
        next = s;
    }

    public int getId() {
        return this.id;
    }
}
