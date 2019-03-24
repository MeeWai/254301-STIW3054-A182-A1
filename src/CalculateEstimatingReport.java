public class CalculateEstimatingReport extends EstimatingForReport implements CalculationMethod {

    int reportSimple,reportAverage, reportComplex;


    CalculateEstimatingReport(int reportSimple,int reportAverage,int reportComplex){
        this.reportSimple=reportSimple;
        this.reportAverage=reportAverage;
        this.reportComplex=reportComplex;
    }

    @Override
    public int subtotal_Simple() {
        return reportSimple*20;
    }

    @Override
    public int subtotal_Average() {
        return reportAverage*15;
    }

    @Override
    public int subtotal_Complex() {
        return reportComplex*10;
    }

    void showCalculation(double AdjustedManHours){
        System.out.print("\nReport Type\t\t\t\tQuantity\tAverage Man-hours\tsub total");
        System.out.print("\n----------------------------------------------------------------");
        System.out.print("\nSimple" + "\t\t\t\t\t\t" + "20" + "\t\t\t\t" + reportSimple + "\t\t\t\t" + subtotal_Simple());
        System.out.print("\nAverage" + "\t\t\t\t\t\t" + "15" + "\t\t\t\t" + reportAverage + "\t\t\t\t" + subtotal_Average());
        System.out.print("\nComplex" + "\t\t\t\t\t\t" + "10" + "\t\t\t\t" + reportComplex + "\t\t\t\t" + subtotal_Complex());
        System.out.print("\n----------------------------------------------------------------");
        double totalManHours=subtotal_Simple()+subtotal_Average()+subtotal_Complex();
        System.out.printf("\nTotal Report Man-hours Estimate : %.2f",totalManHours);
        TotalManHours totalManHours1=new TotalManHours(reportSimple,reportAverage,reportComplex);
        totalManHours1.totalManHours(totalManHours,AdjustedManHours);
    }
}
