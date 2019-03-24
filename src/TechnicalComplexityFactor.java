public class TechnicalComplexityFactor extends CalculateWeightingTechnicalFactor implements  CalculationMethod2{

    double TCF;

    TechnicalComplexityFactor(double[] TF) {
        super(TF);
    }

    @Override
    public void showCalculation(double a, double b) {
        //a=TF, b=uucp
        TCF = (0.01 * a)+0.6;
        showDetails();
        SizeOfSoftware sizeOfSoftware=new SizeOfSoftware(TF);
        sizeOfSoftware.showCalculation(TCF,b);
    }

    @Override
    public void showDetails() {
        System.out.print("\nTechnical Complexity Factor       : " + TCF);
    }
}
