public class UseCasePoints extends CalculateWeightingExperienceFactor implements CalculationMethod2 {

    double UCP;

    @Override
    public void showCalculation(double a, double b) {
        //a=EF, b=SzUC
        UCP = a * b;
        showDetails();
    }


    public void showDetails() {
        System.out.printf("\nUse Case Point (UCP)\t: %.3f", UCP);
        System.out.print("\n------------------------------------------------------------------------------------------");
        CalculateManHours calculateManHours = new CalculateManHours();
        calculateManHours.manhours(UCP);
    }
}
