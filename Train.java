class Train {
    int tNumber;
    String tName;
    String originSta;
    String destSta;
    String dTime;
    String aTime;
    String[] stations;
    String[] arrivalTimes;

    public Train(int tNum, String tN, String origin, String dest, String dep, String arrival, String[] s, String[] aT) {
        tNumber = tNum;
        tName = tN;
        originSta = origin;
        destSta = dest;
        dTime = dep;
        aTime = arrival;
        stations = s;
        arrivalTimes = aT;
    }

    public void displayJourneySchedule() {
        System.out.printf("\nJourney Schedule of %d %s\n", tNumber, tName);
        System.out.printf("%-15s %-10s\n", "Station", "Time");
        System.out.printf("%-15s %-10s\n", originSta, dTime);
        for (int i = 0; i < stations.length; ++i) {
            System.out.printf("%-15s %-10s\n", stations[i], arrivalTimes[i]);
        }
        System.out.printf("%-15s %-10s\n", destSta, aTime);
    }

    public String toString() {
        return String.format("\nName of the Train: %s\nTrain number: %d", tName, tNumber);
    }

    public static void main(String[] args) {
        String[] ss = {"Baroda", "Ratlan", "Kota"};
        String[] ats = {"19:20", "12:30", "8:39"};

        Train rajdhani = new Train(1935, "Rajdhani Express", "Mumbai", "New Delhi", "8:20", "20:30", ss, ats);
        System.out.println(rajdhani);
        rajdhani.displayJourneySchedule();
    }
}
