public class CalculateWeightingExperienceFactor extends WeightingExperienceFactor {


    private double[] ef_weightFactor = {1, 0.5, 1, 0.5, 0, 2, -1, -1};
    private double[] subtotalEF = new double[ef_weightFactor.length];
    private double TotalEF;

    void showCalculation(double[] totalEF, double SzUC) {
        for (int i = 0; i < ef_weightFactor.length; i++) {
            subtotalEF[i] = totalEF[i] * ef_weightFactor[i];
            TotalEF += subtotalEF[i];
        }
        showDetails(totalEF, subtotalEF, TotalEF, SzUC);
    }

    private void showDetails(double[] totalEF, double[] subtotalEF, double TotalEF, double SzUC) {
        System.out.print("\nExperience Factor\t\tFactor Description\t\tWeight Factor\tProject Rating\tsub total");
        System.out.print("\n------------------------------------------------------------------------------------------");
        System.out.print("\n\t\t" + "E1" + "\t\t\t\t" + "Familiar with FPT" + "\n\t\t\t\t\t\t" + "software process" + "\t\t\t" + "1" + "\t\t\t\t" + totalEF[0] + "\t\t\t\t" + subtotalEF[0]);
        System.out.print("\n\t\t" + "E2" + "\t\t\t\t" + "Application experience" + "\t\t" + "0.5" + "\t\t\t\t" + totalEF[1] + "\t\t\t\t" + subtotalEF[1]);
        System.out.print("\n\t\t" + "E3" + "\t\t\t\t" + "Paradigm" + "\n\t\t\t\t\t\t" + "Experience ( OO )" + "\t\t\t" + "1" + "\t\t\t\t" + totalEF[2] + "\t\t\t\t" + subtotalEF[2]);
        System.out.print("\n\t\t" + "E4" + "\t\t\t\t" + "Lead analyst" + "\n\t\t\t\t\t\t" + "capability" + "\t\t\t\t\t" + "0.5" + "\t\t\t\t" + totalEF[3] + "\t\t\t\t" + subtotalEF[3]);
        System.out.print("\n\t\t" + "E5" + "\t\t\t\t" + "Motivation" + "\t\t\t\t\t" + "0" + "\t\t\t\t" + totalEF[4] + "\t\t\t\t" + subtotalEF[4]);
        System.out.print("\n\t\t" + "E6" + "\t\t\t\t" + "Stable Requirement" + "\t\t\t" + "2" + "\t\t\t\t" + totalEF[5] + "\t\t\t\t" + subtotalEF[5]);
        System.out.print("\n\t\t" + "E7" + "\t\t\t\t" + "Part-time workers " + "\t\t\t" + "-1" + "\t\t\t\t" + totalEF[6] + "\t\t\t\t" + subtotalEF[6]);
        System.out.print("\n\t\t" + "E8" + "\t\t\t\t" + "Difficulty of" + "\n\t\t\t\t\t\t" + "programming language" + "\t\t" + "-1" + "\t\t\t\t" + totalEF[7] + "\t\t\t\t" + subtotalEF[7]);
        System.out.print("\n------------------------------------------------------------------------------------------");
        System.out.print("\nTotal Experience Factor : " + TotalEF);
       ExperienceFactor experienceFactor=new ExperienceFactor();
       experienceFactor.showCalculation(TotalEF,SzUC);
    }
}
