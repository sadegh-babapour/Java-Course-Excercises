import javax.swing.JOptionPane;

public class Q {
    public static void main(String[] args) {
        String mortgage;
        mortgage = JOptionPane.showInputDialog("Please Enter Your Mortgage Type: ");
        if (mortgage.equals("open")) {
            System.out.println("You Chose Mortgage: Open!");
            String openDuration;
            openDuration = JOptionPane.showInputDialog("Please Enter your Open Mortgage Duration: ");
            if (openDuration.equals("1 yr"))
                System.out.println("Open Mortgage rate for 1 yr period is: " + "7.10 %");
            else if (openDuration.equals("3 yr"))
                System.out.println("Open Mortgage rate for 3 yr period is: " + "7.50 %");
            else if (openDuration.equals("5 yr"))
                System.out.println("Open Mortgage rate for 5 yr period is: " + "Not Available!");
            else
                System.out.println("Incorrect Mortgage Duration!");
        }
        else if (mortgage.equals("closed")) {
            System.out.println("You Chose Mortgage: Closed!");
            String closedDuration;
                closedDuration = JOptionPane.showInputDialog("Please Enter your Closed Mortgage Duration: ");
                if (closedDuration.equals("1 yr"))
                    System.out.println("Closed Mortgage rate for 1 yr period is: " + "5.30 %");
                else if (closedDuration.equals("3 yr"))
                    System.out.println("Closed Mortgage rate for 3 yr period is: " + "5.00 %");
                else if (closedDuration.equals("5 yr"))
                    System.out.println("Closed Mortgage rate for 5 yr period is: " + "5.75 %");
        }
        else
            System.out.println("You did NOT choose the correct type of Mortgage!!");
    }
}
