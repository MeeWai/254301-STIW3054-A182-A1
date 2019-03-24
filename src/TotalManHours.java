public class TotalManHours extends CalculateEstimatingReport {
    TotalManHours(int reportSimple, int reportAverage, int reportComplex) {
        super(reportSimple, reportAverage, reportComplex);
    }

    void totalManHours(double reportingmanhours,double AdjustedManHours){

        double total_manhours=AdjustedManHours+reportingmanhours;
        System.out.printf("\nTotal man-hours\t\t\t\t\t: %.2f",total_manhours);

    }
}
