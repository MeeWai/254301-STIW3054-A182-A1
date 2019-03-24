import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingExperienceFactor extends SoftwareEffortEstimation {

    public static Scanner scan;

    void weigthingTechnicalFactor(double SzUC) {

        String[] EF = {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8"};
        double[] ef = new double[EF.length];
        boolean x;

        System.out.println("\n\n## Step 4 (Please insert integer only) ##");
        System.out.print("Please enter the project rating for each EXPERIENCE FACTOR type: " + "\n** Experience Factor Type **\n");

        for (int i = 0; i < EF.length; i++) {
            do {
                try {
                    scan = new Scanner(System.in);
                    System.out.print(EF[i] + " : ");
                    ef[i] = scan.nextInt();
                    if (ef[i] < 0 || ef[i] > 5) {
                       throw new InputMismatchException();
                    }
                    x = false;
                } catch (InputMismatchException e) {
                    System.out.println("Please input VALID INTEGER (0-5) only !!");
                    x = true;
                }
            } while (x==true);
        }
        CalculateWeightingExperienceFactor calculateWeightingExperienceFactor = new CalculateWeightingExperienceFactor();
        calculateWeightingExperienceFactor.showCalculation(ef, SzUC);
    }
}


