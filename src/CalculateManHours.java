import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateManHours extends SoftwareEffortEstimation {

    private double percentage2;

    void manhours(double UCP) {
        System.out.print("\n\nCalculating Man-hours from UCP");
        System.out.print("\n------------------------------------------------");
        double man_hours = 20 * UCP;
        double man_hours2 = 28 * UCP;
        System.out.printf("\n 20 man-hours per UCP : %.2f man-hours ", man_hours);
        System.out.printf("\n 28 man-hours per UCP : %.2f man-hours ", man_hours2);
        System.out.print("\n------------------------------------------------");
        adjustingmanhours(man_hours2);
    }

    private void adjustingmanhours(double totalManHour) {
        System.out.print("\n\nCalculating Adjusted Man-hours (Please insert integer only) ");
        System.out.print("\n--------------------------------------------------------------");
        boolean x;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("\nPlease enter the coefficient as a percentage (%) : ");
                double percentage = scan.nextDouble();
                percentage2 = percentage / 100;
                x =false;
            } catch (InputMismatchException e) {
                System.out.print("Please input valid integer !!");
                x =true;
            }
        }while (x ==true);
        AdjustedManhours totalManHours = new AdjustedManhours();
        totalManHours.adjustedManHours(percentage2, totalManHour);
    }
}
