import java.util.ArrayList;
import java.util.Scanner;

public class MarathonArray {

    public static void main(String[] args) {

        // Define two array lists here to store the names and the running times
        ArrayList<String> runnerNames = new ArrayList<String>();
        ArrayList<Integer> runnerTimes = new ArrayList<Integer>();


// Read user input
        String sin;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name of the participant");
            sin = scan.nextLine();
            if (sin.toUpperCase().equals("QUIT"))

                break;

            // Add the name to your ArrayList
            runnerNames.add(sin);
            System.out.println("Please enter the running time of the participant");
            sin = scan.nextLine();

            // Add the running time to your array list
            runnerTimes.add(new Integer(sin));
        }


        int tempIndex = findFastestRunner(runnerTimes);

        // Print the name of the fastestrunner to the console
        System.out.println(runnerNames);
        System.out.println(runnerTimes);
        System.out.println(runnerNames.size());
        System.out.println(runnerTimes.size());
        System.out.println("The Fastest Runner is: " + runnerNames.get(tempIndex) + " and his time is " + runnerTimes.get(tempIndex) + " minutes.");


    }

    public static int findFastestRunner(ArrayList<Integer> arrlist) {


        int max = 5000000;  //it is supposed that nobody has a time record more than 999 minutes
        int minIndex = 0;

        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(i) < max) {
                max = arrlist.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
        

