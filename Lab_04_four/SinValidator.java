import java.util.Scanner;

public class SinValidator {

    private int[] SIN;

    private int sumDigit(int x)
    {
        int result =0;

        while(x > 0){
            result += x % 10;
            x = x /10;
        }

        return result;
    }

    public SinValidator(String sin) {

        SIN = new int[9];
        int i =0;
        int counter =0;
        while(i < sin.length()){


            if(Character.isDigit(sin.charAt(i))){
                if(counter < 9)
                    SIN[counter] =(int) sin.charAt(i) - 48;
                counter++;
            }
            else{
                System.err.println("Error: Invalid input by the user");
                return;
            }
            i++;
        }

        if(counter != 9){
            System.err.println("Error: SIN must be 9 digits...");
            return;
        }
    }

    public boolean validateSin() {
        int temp1 = SIN[0] + SIN[2] + SIN[4] + SIN[6];
        int[] temp2 = new int[4];
        int[] sum = {0, 0, 0, 0};

        temp2[0] = SIN[1] * 2 ;
        temp2[1] = SIN[3] * 2;
        temp2[2] = SIN[5] * 2;
        temp2[3] = SIN[7] * 2;

        for (int i = 0; i < temp2.length; i++) {
            while (temp2[i] > 0) {
                sum[i] = sum[i] + (temp2[i] % 10);
                temp2[i] = temp2[i] / 10;
            }
        }
        int sum3 = sum[0] + sum[1] + sum[2] + sum[3];
        int sum4 = sum3 + temp1;
        int temp3 = 10 - (sum4 % 10);
        if (temp3 == SIN[8]) {
            return true;
        } else {
            return false;
        }
    }

        public static void main (String[] args){
            // Read user input

            String sin;
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Please enter your 10 digit social insurance number"
                        + " or enter quit to terminate the program: ");
                sin = scan.nextLine();
                if (sin.toUpperCase().equals("QUIT"))
                    break;
                SinValidator sv = new SinValidator(sin);

                if (sv.validateSin())
                    System.out.println("Yes this is a valid SIN\n");
                else
                    System.out.println("No this is NOT a valid SIN\n");
            }
    }
}
