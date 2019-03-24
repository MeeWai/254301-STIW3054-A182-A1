import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightingTechnicalFactor extends SoftwareEffortEstimation {

    private String[] TF = {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13"};
    private double[] tf = new double[TF.length];

    void weigthingTechnicalFactor(int uucp) {

        System.out.println("\n\n## Step 3 (Please insert integer only) ##");
        System.out.print("Please enter the project rating for each TECHNICAL FACTOR type: " + "\n** Technical Factor Type **\n");

        for (int i = 0; i < TF.length; i++) {
            boolean x;
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    System.out.print(TF[i] + " : ");
                    tf[i] = scan.nextInt();
                    if (tf[i] < 0 || tf[i] > 5) {
                        throw new InputMismatchException();
                    }
                    x = false;
                } catch (InputMismatchException e) {
                    System.out.println("Please input valid INTEGER (0-5) only !!");
                    x = true;
                }
            } while (x ==true);
        }
        CalculateWeightingTechnicalFactor calculateWeightingTechnicalFactor = new CalculateWeightingTechnicalFactor(tf);
        calculateWeightingTechnicalFactor.showCalculation(uucp);
    }
}
