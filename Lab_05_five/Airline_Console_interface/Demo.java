import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        System.out.println("Welcome to my Airplane Booking Program.");
        System.out.println("First press B and add the number of rows for your plane");
        Airplane aero = new Airplane();

        System.out.println("To add Passenger, please press A");
        System.out.println("To Show list of Passengers, Press L");
        System.out.println("To see the plane outline, press M");
        System.out.println("To search for a passenger, press S");

        boolean isCorrect = true;
        while (isCorrect) {

            String ss = sc.next();
            if (ss.toUpperCase().equals("B")){
                aero =planeBuilder();
            }
            else if (ss.toUpperCase().equals("M")) {
                aero.showSeats();
            }
            else if (ss.toUpperCase().equals("A")){
                adder(aero);
            }
            else if (ss.toUpperCase().equals("L")){
                System.out.println(aero.toString());
            }
            else if (ss.toUpperCase().equals("Q")){
                System.out.println("Good bye!");
                isCorrect = false;
            }
            else if (ss.toUpperCase().equals("S")){
                System.out.println("Who u looking 4?");
                String name =scc.nextLine();
                aero.search(name);
            }
            else{
                System.out.println("wrong, try againnnn");
            }

        }
    }


//                aeroplane.addPassenger(name,row,seat);
//
//            }
//            System.out.println(aeroplane.toString());
//            aeroplane.showSeats();


    public static void adder(Airplane aeroplane) {
        int n = aeroplane.getNumOfRows();
        String name="";
        int row =0;
        char seat = 'q';
        int inputn = 0;
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Passengers would you like to add");
        while (isTrue) {
            inputn = sc.nextInt();
            if (inputn >= 1 && inputn <= 5 * n) {
                isTrue = false;
            } else {
                System.out.println("You can not add 0 or more than plane capacity, try again");
            }

        }
        for (int i = 0; i < inputn; i++) {
            System.out.println("What's the name of the Passenger " + (i + 1)+ " first & last");
            name = sc.next();
            name = name + " " + sc.next();
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
            boolean avail = true;
            while (avail) {
                if (aeroplane.checkAvailability(row, seat) == true) {
                    System.out.println("Seat Assigned");
                    aeroplane.addPassenger(name,row,seat);
                    avail = false;
                } else {

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
        }

    }

    public static Airplane planeBuilder(){
        int n = 0;
        Scanner sc = new Scanner(System.in);
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
        Airplane aeroplane = new Airplane(n);
        return aeroplane;
    }
}