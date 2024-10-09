import java.util.ArrayList;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) {
        // Initialize the database with empty lists
        Database db = new Database(new ArrayList<>(), new ArrayList<>());


        //Benchmark
        String [] databases={"AP","balance-scale", "BK", "cancer", "CH", "diabetes", "glass","heart", "Iris","NT", "LW","sonar", "yacht" };


        for (String database : databases) {

            db.readDB("../Normalized_data/benchmark/" + database + "_T.dat");
            System.out.println("\n");
            System.out.println("Database: " + database);
            //db.showDB();
            //db.getDBStatistics();



            // for testing:
            //IPSampling ips = new IPSampling(db);
            //IP ip= ips.drawIP();
             /*   for (int i = 0; i < 10; i++) {
                    RandomIPSampling rips = new RandomIPSampling(db);
                    IP ip = rips.drawIP();
                    ip.showIP();
                    ip.showCoverage();
                    //System.out.println("volume: "+ip.getVolume());

                }*/




        }


    }

}