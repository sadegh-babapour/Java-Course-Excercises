public class MyLab00 {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        int a;
        int b;

        // Question a
        if ((x > 100 || x < 0) && (x >= y));
        System.out.println("X is grater than 100 or less than 0, and it is grater than y");

        // Question b
        // if ((y < x < z) && (x < 10 || x >= 100))

        if ((x > y && x < z) && (x < 10 || x >= 100))
            System.out.println("x is greater than y but less than z, and also x is either less than 10 or greater\n" +
                    "than or equal to 100 ");

        //Question c
        if (( a <= 0 || a > 90) && (a == b))
            System.out.println("a is less than or equal to 0 or greater than 90 and a is equal to b.");

        //Question d
        if ((y >= 50) && (y >z && y <= x))
            System.out.println("y is greater than or equal to 50.  It also is greater than z but\n"+
                            "less than or equal to x");
    }
}
