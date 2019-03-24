public class TotalUseCase extends CalculateUseCase{

    private int totalucp;

    TotalUseCase(int weightFactor_Simple, int weightFactor_Average, int weightFactor_Complex,int totalucp) {
        super(weightFactor_Simple, weightFactor_Average, weightFactor_Complex);
        this.totalucp=totalucp;
    }

    void calculateUC(int totalAP) {

        System.out.println("\nTotal Use Case\t\t\t\t:" + totalucp);

        UnadjustedUseCasePoint unadjustedUseCasePoint = new UnadjustedUseCasePoint(weightFactor_Simple_usecase, weightFactor_Average_usecase, weightFactor_Complex_usecase,totalucp);
        unadjustedUseCasePoint.calculateUC(totalAP);
    }
}
