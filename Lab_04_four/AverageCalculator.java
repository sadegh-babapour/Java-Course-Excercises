import java.util.Arrays;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;

        System.out.printf("The " + args.length + " numbers are: ");

        for (int i = 0; i < args.length; i++) {
            Double value = Double.parseDouble(args[i]);
            System.out.printf("%.3f ", value);
            sum += value;
            //System.out.println(sum);
        }
        average = sum / args.length;
        System.out.println();
        System.out.printf("The average is: " + "%.3f",average);
    }
}

