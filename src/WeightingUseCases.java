import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingUseCases extends SoftwareEffortEstimation {
    public int weightFactor_Simple_usecase, weightFactor_Average_usecase, weightFactor_Complex_usecase;

    public static Scanner scan;
    private boolean x;

    WeightingUseCases(int weightFactor_Simple_usecase, int weightFactor_Average_usecase, int weightFactor_Complex_usecase) {
        this.weightFactor_Simple_usecase = weightFactor_Simple_usecase;
        this.weightFactor_Average_usecase = weightFactor_Average_usecase;
        this.weightFactor_Complex_usecase = weightFactor_Complex_usecase;
    }

    void weightingusecases(int totalAP) {
        System.out.println("\n\n## Step 2 (Please insert integer only) ##");
        System.out.print("Please enter the quantity for each USE CASE type: ");

        do {
            try {
                scan = new Scanner(System.in);
                System.out.print(" \n** Use Case Type **" + "\nSimple : ");
                weightFactor_Simple_usecase = scan.nextInt();
                System.out.print("Average : ");
                weightFactor_Average_usecase = scan.nextInt();
                System.out.print("Complex : ");
                weightFactor_Complex_usecase = scan.nextInt();
                x = false;
                CalculateUseCase calculateUseCase = new CalculateUseCase(weightFactor_Simple_usecase, weightFactor_Average_usecase, weightFactor_Complex_usecase);
                calculateUseCase.calculateUC(totalAP);
            } catch (InputMismatchException e) {
                System.out.println("Please input INTEGER only !!");
                x = true;
            }
        } while (x == true);

    }
}

