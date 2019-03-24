import java.util.InputMismatchException;
import java.util.Scanner;

public class SoftwareEffortEstimation {

    private static Scanner scan;

    public static void main(String[] args) {

        boolean x ;
        int weightFactor_Simple, weightFactor_Average, weightFactor_Complex;
        CalculateActorsPoints calculateActorsPoints = null;

        System.out.println("## Step 1 (Please insert integer only) ##");
        System.out.print("Please enter the quantity for each ACTOR type: ");

        do {
            try {
                scan = new Scanner(System.in);
                System.out.print("\n** Actor Type **");
                System.out.print("\nSimple : ");
                weightFactor_Simple = scan.nextInt();
                System.out.print("Average : ");
                weightFactor_Average = scan.nextInt();
                System.out.print("Complex : ");
                weightFactor_Complex = scan.nextInt();
                x=false;
                calculateActorsPoints = new CalculateActorsPoints(weightFactor_Simple, weightFactor_Average, weightFactor_Complex);
            } catch (InputMismatchException e) {
                System.out.println("Please input INTEGER only !!");
                x=true;
            }
        } while (x==true);
        calculateActorsPoints.calculateAP();
    }

}

