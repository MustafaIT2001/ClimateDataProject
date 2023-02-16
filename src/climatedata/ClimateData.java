package climatedata;

/**
 *
 * @author Mustafa
 */
public class ClimateData {

    private DailyReading[] read;
    private double avgMaxTemp;

    private double avgMinTemp;

    private int[] yearStartingIndexes;

    private int countFiles = 1;


    public void readDataIntoArrays(String data) {
        int i = 0;

        try {
            read = new DailyReading[29223];

        } catch (Exception e) {
            System.out.println("Finish here.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClimateData driver = new ClimateData();
    }
    
}
