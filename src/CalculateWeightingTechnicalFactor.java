public class CalculateWeightingTechnicalFactor extends WeightingTechnicalFactor {

    private double[] tf_weightFactor = {2, 1, 1, 1, 1, 0.5, 0.5, 2, 1, 1, 1, 1, 1};
    private double[] subtotalTF = new double[13];
    private double TotalTF;
    double [] TF;

    CalculateWeightingTechnicalFactor(double []TF){
        this.TF=TF;
    }

    void showCalculation(int uucp) {
        for (int i = 0; i < tf_weightFactor.length; i++) {
            subtotalTF[i] = TF[i] * tf_weightFactor[i];
            TotalTF += subtotalTF[i];
        }
        showDetails(TF, subtotalTF, TotalTF, uucp);
    }

    private void showDetails(double[] totalTF, double[] subtotalTF, double TotalTF, int uucp) {
        System.out.print("\nTechnical Factor\t\tFactor Description\t\tWeight Factor\tProject Rating\tsub total");
        System.out.print("\n------------------------------------------------------------------------------------------");
        System.out.print("\n\t\t" + "T1" + "\t\t\t\t" + "Must have a" + "\n\t\t\t\t\t\t" + "distributed solution" + "\t\t" + "2" + "\t\t\t\t" + totalTF[0] + "\t\t\t\t" + subtotalTF[0]);
        System.out.print("\n\t\tT2" + "" + "\t\t\t\t" + "Must respond to" + "\n\t\t\t\t\t\t" + "specific performance" + "\n\t\t\t\t\t\t" + "objectives" + "\t\t\t\t\t" + "1" + "\t\t\t\t" + totalTF[1] + "\t\t\t\t" + subtotalTF[1]);
        System.out.print("\n\t\tT3" + "\t\t\t\t" + "Must meet end-user" + "\n\t\t\t\t\t\t" + "efficiency desires" + "\t\t\t" + "1" + "\t\t\t\t" + totalTF[2] + "\t\t\t\t" + subtotalTF[2]);
        System.out.print("\n\t\tT4" + "\t\t\t\t" + "Complex internal" + "\n\t\t\t\t\t\t" + "processing" + "\t\t\t\t\t" + "1" + "\t\t\t\t" + totalTF[3] + "\t\t\t\t" + subtotalTF[3]);
        System.out.print("\n\t\tT5" + "\t\t\t\t" + "Code must be" + "\n\t\t\t\t\t\t" + "reusable" + "\t\t\t\t\t" + "1" + "\t\t\t\t" + totalTF[4] + "\t\t\t\t" + subtotalTF[4]);
        System.out.print("\n\t\tT6" + "\t\t\t\t" + "Must be easy" + "\n\t\t\t\t\t\t" + "to install" + "\t\t\t\t\t" + "0.5" + "\t\t\t\t" + totalTF[5] + "\t\t\t    " + subtotalTF[5]);
        System.out.print("\n\t\tT7" + "\t\t\t\t" + "Must be easy" + "\n\t\t\t\t\t\t" + "to use" + "\t\t\t\t\t\t" + "0.5" + "\t\t\t\t" + totalTF[6] + "\t\t\t\t" + subtotalTF[6]);
        System.out.print("\n\t\tT8" + "\t\t\t\t" + "Must be portable" + "\t\t\t" + "2" + "\t\t\t\t" + totalTF[7] + "\t\t\t\t" + subtotalTF[7]);
        System.out.print("\n\t\tT9" + "\t\t\t\t" + "Must be easy" + "\n\t\t\t\t\t\t" + "to change" + "\t\t\t\t\t" + "1" + "\t\t\t\t" + totalTF[8] + "\t\t\t\t" + subtotalTF[8]);
        System.out.print("\n\t\tT10" + "\t\t\t\t" + "Must allow" + "\n\t\t\t\t\t\t" + "concurent user" + "\t\t\t\t" + "1" + "\t\t\t\t" + totalTF[9] + "\t\t\t\t" + subtotalTF[9]);
        System.out.print("\n\t\tT11" + "\t\t\t\t" + "Includes special" + "\n\t\t\t\t\t\t" + "security features" + "\t\t\t" + "1" + "\t\t\t\t" + totalTF[10] + "\t\t\t\t" + subtotalTF[10]);
        System.out.print("\n\t\tT12" + "\t\t\t\t" + "Must provide direct" + "\n\t\t\t\t\t\t" + "access for 3rd parties" + "\t\t" + "1" + "\t\t\t\t" + totalTF[11] + "\t\t\t\t" + subtotalTF[11]);
        System.out.print("\n\t\tT13" + "\t\t\t\t" + "Requires special user" + "\n\t\t\t\t\t\t" + "training facilities" + "\t\t\t" + "1" + "\t\t\t\t" + totalTF[12] + "\t\t\t\t" + subtotalTF[12]);
        System.out.print("\n------------------------------------------------------------------------------------------");
        System.out.print("\nTotal Techincal Complexity Factor : " + TotalTF);
        TechnicalComplexityFactor technicalComplexityFactor = new TechnicalComplexityFactor(totalTF);
        technicalComplexityFactor.showCalculation(TotalTF, uucp);
    }
}



