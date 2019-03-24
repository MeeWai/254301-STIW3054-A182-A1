public class SizeOfSoftware extends  CalculateWeightingTechnicalFactor implements CalculationMethod2{

    double sizeOfSoftware;

    SizeOfSoftware(double[] TF) {
        super(TF);
    }

    @Override
    public void showCalculation(double a, double b) {
        //a=TCF, b=uucp
        sizeOfSoftware=a*b;
        showDetails();
    }

    @Override
    public void showDetails() {
        System.out.printf("\nSize of software\t\t\t\t  : %.2f",sizeOfSoftware);
        System.out.print("\n------------------------------------------------------------------------------------------");
        WeightingExperienceFactor weightingExperienceFactor=new WeightingExperienceFactor();
        weightingExperienceFactor.weigthingTechnicalFactor(sizeOfSoftware);
    }
}
