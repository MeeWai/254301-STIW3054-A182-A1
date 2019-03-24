public class ExperienceFactor extends CalculateWeightingExperienceFactor implements CalculationMethod2 {

    double EF;

    @Override
    public void showCalculation(double a, double b) {
        //a=TotalEF, b=SzUC
        EF = (-0.03 * a) + 1.4;
        showDetails();
        UseCasePoints useCasePoints = new UseCasePoints();
        useCasePoints.showCalculation(EF, b);
    }

    @Override
    public void showDetails() {
        System.out.printf("\nExperience Factor\t\t: %.2f ", EF);
    }
}
