public class CalculateUseCase extends WeightingUseCases implements CalculationMethod{


    CalculateUseCase(int weightFactor_Simple_usecase, int weightFactor_Average_usecase, int weightFactor_Complex_usecase) {
        super(weightFactor_Simple_usecase, weightFactor_Average_usecase, weightFactor_Complex_usecase);
    }

    public int subtotal_Simple() {
        return weightFactor_Simple_usecase * 5;
    }


    public int subtotal_Average() {
        return weightFactor_Average_usecase * 10;
    }


    public int subtotal_Complex() {
        return weightFactor_Complex_usecase*15 ;
    }

    void calculateUC(int totalAP) {
        System.out.print("\nUses Case Type\t\tDescription\t\t\tWeight Factor\tQuantity\tSub total");
        System.out.print("\n---------------------------------------------------------------------------------");
        System.out.print("\nSimple" + "\t\t\t" + "3 0r fewer transaction" + "\t\t" + "5" + "\t\t\t\t" + weightFactor_Simple_usecase + "\t\t\t\t" + subtotal_Simple());
        System.out.print("\nAverage" + "\t\t\t" + "Interactive or Protocol" + "\n\t\t\t\t" + "driven interface" + "\t\t\t" + "10" + "\t\t\t\t" + weightFactor_Average_usecase + "\t\t\t\t" + subtotal_Average());
        System.out.print("\nComplex" + "\t\t\t" + "Graphical User Interface" + "\t" + "15" + "\t\t\t\t" + weightFactor_Complex_usecase + "\t\t\t\t" + subtotal_Complex());
        System.out.print("\n---------------------------------------------------------------------------------");
        int  totalUCP=subtotal_Simple()+subtotal_Average()+subtotal_Complex();
        TotalUseCase totalUseCase = new TotalUseCase(weightFactor_Simple_usecase, weightFactor_Average_usecase, weightFactor_Complex_usecase,totalUCP);
        totalUseCase.calculateUC(totalAP);
    }
}



