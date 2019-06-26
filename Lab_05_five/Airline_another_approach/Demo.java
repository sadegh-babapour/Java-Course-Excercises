import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Airplane Booking Program.");
        int n =0;
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("How many rows do u want to have in your Airplane? 0 to 20");
            n = sc.nextInt();

            if (n > 0 && n < 21) {
                isTrue = false;
            } else {
                System.out.println("Try Again!");
                isTrue = true;
            }
        }
        System.out.println("Would you like to go to the next phase?");
        String input = sc.next();
        if (input.toUpperCase().equals("YES"))
            System.out.println("Sweet, let's add some passengers!");
        while (!input.toUpperCase().equals("YES")) {
        System.out.println("Wrong answer, try again!");
        input = sc.next();

        }

        int inputn = 0;
        isTrue = true;
        System.out.println("How many Passengers would you like to add");
        while (isTrue){
            inputn =sc.nextInt();
            if (inputn >=1 && inputn<= 5*n){
                isTrue = false;
            }
            else{
                System.out.println("You can not add 0 or more than plane capacity, try again");
            }

        }


        Airplane aeroplane = new Airplane(n);

        for (int i = 0; i < inputn; i++){
            System.out.println("What's the name of the Passenger first & last " + (i+1));
            String name = sc.next();
            name = name +" "+ sc.next();
            System.out.println("Which row? ");
            int row = sc.nextInt();
            while (row < 1 || row > n){
                System.out.println("Your choice should be between 1 and " + n + "\n" + "Try Again");
                row = sc.nextInt();
            }
            row -= 1;
            System.out.println("Which Seat? ");
            char seat = sc.next().toUpperCase().charAt(0);
            while(seat - 'A' >= 5 || seat - 'A' < 0){
                System.out.println("Available Seats are: A,B,C,D and E, try again: ");
                seat = sc.next().toUpperCase().charAt(0);
            }
            boolean avail = true;
            while (avail) {
                if (aeroplane.checkAvailability(row, seat) == true) {
                    System.out.println("Seat Assigned");
                    avail = false;
                }
                else {

                    System.out.println("Seat is Taken, try another one.");
                    System.out.println("Which row? ");
                    row = sc.nextInt();
                    while (row < 1 || row > n) {
                        System.out.println("Your choice should be between 1 and " + n + "\n" + "Try Again");
                        row = sc.nextInt();
                    }
                    row -= 1;
                    System.out.println("Which Seat? ");
                    seat = sc.next().toUpperCase().charAt(0);
                    while (seat - 'A' >= 5 || seat - 'A' < 0) {
                        System.out.println("Available Seats are: A,B,C,D and E, try again: ");
                        seat = sc.next().toUpperCase().charAt(0);

                    }
                }
            }
            aeroplane.addPassenger(name,row,seat);

        }
        System.out.println(aeroplane.toString());
        aeroplane.showSeats();

//        Airplane aeroplane = new Airplane(4);
//        aeroplane.addPassenger("James", 0, 'E');
//        aeroplane.addPassenger("James johnson", 1, 'E');
//        aeroplane.addPassenger("Masoud", 2, 'A');
//        aeroplane.addPassenger("vali", 3, 'D');
//        aeroplane.addPassenger("mike", 1, 'C');
//        aeroplane.addPassenger("brett", 0, 'E');
//        aeroplane.addPassenger("akbari bala", 3, 'B');
//        aeroplane.addPassenger("kiavash", 3, 'E');
//        System.out.println(aeroplane.toString());
//        aeroplane.showSeats();
//        System.out.println(aeroplane.search("kiiavash"));
    }
}
