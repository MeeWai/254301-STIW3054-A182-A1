import java.util.InputMismatchException;
import java.util.Scanner;

public class EstimatingForReport extends CalculateManHours {

    private static Scanner scan;
    boolean x;
    CalculateEstimatingReport calculateEstimatingReport=null;

    void estimatingReport(double ajustedmanhours) {

        System.out.print("\n\n## Step 5 (Please insert integer only) ##");
        System.out.print("\nPlease enter the quantity for each REPORT type: ");

        do{
        try {
            scan = new Scanner(System.in);
            System.out.print("\n** Report Type **"+"\nSimple : ");
            int ReportType_Simple = scan.nextInt();
            System.out.print("Average : ");
            int ReportType_Average = scan.nextInt();
            System.out.print("Complex : ");
            int ReportType_Complex = scan.nextInt();
            CalculateEstimatingReport calculateEstimatingReport = new CalculateEstimatingReport(ReportType_Simple, ReportType_Average, ReportType_Complex);
            calculateEstimatingReport.showCalculation(ajustedmanhours);
        } catch (InputMismatchException e) {
            System.out.print("Please insert valid integer !!");
            x=true;
        }
    }while (x==true);
    }
}
