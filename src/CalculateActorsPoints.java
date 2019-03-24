public class CalculateActorsPoints extends SoftwareEffortEstimation implements CalculationMethod {

    public int weightFactor_Simple, weightFactor_Average, weightFactor_Complex;

    private int Quantity_Simple = 1;
    private int Quantity_Average = 2;
    private int Quantity_Complex = 3;


    CalculateActorsPoints(int weightFactor_Simple, int weightFactor_Average, int weightFactor_Complex) {
        this.weightFactor_Simple = weightFactor_Simple;
        this.weightFactor_Average = weightFactor_Average;
        this.weightFactor_Complex = weightFactor_Complex;
    }

    @Override
    public int subtotal_Simple() {
        return weightFactor_Simple * Quantity_Simple;
    }

    @Override
    public int subtotal_Average() {
        return weightFactor_Average * Quantity_Average;
    }

    @Override
    public int subtotal_Complex() {
        return weightFactor_Complex * Quantity_Complex;
    }

    int calculateAP() {
        System.out.print("\nActor Type\t\tDescription\t\t\t\tWeight Factor\tQuantity\tsub total");
        System.out.print("\n---------------------------------------------------------------------------------");
        System.out.print("\nSimple" + "\t\t\t" + "Defined Api" + "\t\t\t\t\t" + Quantity_Simple + "\t\t\t\t" + weightFactor_Simple + "\t\t\t\t" + subtotal_Simple());
        System.out.print("\nAverage" + "\t\t\t" + "Interactive or Protocol" + "\n\t\t\t\t" + "driven interface\t\t\t" + Quantity_Average + "\t\t\t\t" + weightFactor_Average + "\t\t\t\t" + subtotal_Average());
        System.out.print("\nComplex" + "\t\t\t" + "Graphical User Interface\t" + Quantity_Complex + "\t\t\t\t" + weightFactor_Complex + "\t\t\t\t" + subtotal_Complex());
        System.out.print("\n---------------------------------------------------------------------------------");
        int totalAP = subtotal_Simple() + subtotal_Average() + subtotal_Complex();
        TotalActorPoints totalActorPoints = new TotalActorPoints(weightFactor_Simple, weightFactor_Average, weightFactor_Complex, totalAP);
        totalActorPoints.calculateAP();
        return totalAP;
    }


}
