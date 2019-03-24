public class AdjustedManhours extends CalculateManHours  {

    void adjustedManHours(double percentage,double totalManHour){
        double AdjustedManHours=(1.0+percentage)*totalManHour;
        System.out.printf("Adjusted man-hours\t\t\t\t\t\t\t\t : %.2f",AdjustedManHours);
        System.out.print("\n--------------------------------------------------------------");
        EstimatingForReport estimatingForReport=new EstimatingForReport();
        estimatingForReport.estimatingReport(AdjustedManHours);
    }
}
