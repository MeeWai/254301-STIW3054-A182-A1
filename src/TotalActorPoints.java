public class TotalActorPoints extends CalculateActorsPoints {

    int totalAP;
    TotalActorPoints(int weightFactor_Simple, int weightFactor_Average, int weightFactor_Complex,int totalAP) {
        super(weightFactor_Simple, weightFactor_Average, weightFactor_Complex);
        this.totalAP=totalAP;
    }

    int calculateAP()  {
        System.out.println("\nTotal Actor Points : " + totalAP);
        WeightingUseCases weightingUseCases = new WeightingUseCases(weightFactor_Simple, weightFactor_Average, weightFactor_Complex);
        weightingUseCases.weightingusecases(totalAP);
        return totalAP;
    }
}