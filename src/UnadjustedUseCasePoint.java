public class UnadjustedUseCasePoint extends CalculateUseCase{

    int totalucp;
    UnadjustedUseCasePoint(int weightFactor_Simple, int weightFactor_Average, int weightFactor_Complex,int totalucp) {
        super(weightFactor_Simple, weightFactor_Average, weightFactor_Complex);
        this.totalucp=totalucp;
    }

    void calculateUC(int totalAP){
        int uucp = totalAP + totalucp;
        System.out.println("Unadjusted Use Case Point\t:"+uucp);
        System.out.print("---------------------------------------------------------------------------------");
        WeightingTechnicalFactor weightingTechnicalFactor=new WeightingTechnicalFactor();
        weightingTechnicalFactor.weigthingTechnicalFactor(uucp);
    }
}
