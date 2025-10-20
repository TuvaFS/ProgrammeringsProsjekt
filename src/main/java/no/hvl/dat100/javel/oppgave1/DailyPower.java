package no.hvl.dat100.javel.oppgave1;

public class DailyPower {


    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        String headerLine = "--------------------";
        //  Header
        System.out.println("Electrical spot-price in NOK per kWh for a day");
        System.out.println(headerLine);
        System.out.println("| Hours   | Prices |");
        System.out.println(headerLine);

        // Print prices
        for (int i = 0; i < prices.length; i++){
            System.out.println("| " + String.format("%02d", i) + " - " + String.format("%02d", i+1) + " |    " + prices[i] + " |");
        }
        System.out.println(headerLine);
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        String headerLine = "-------------------";
        //  Header
        System.out.println("Electrical day-usage in kWh");
        System.out.println(headerLine);
        System.out.println("| Hours   | Usage |");
        System.out.println(headerLine);

        //  Print usage
        for (int i = 0; i <usage.length; i++){
            System.out.println("| " + String.format("%02d", i) + " - " + String.format("%02d", i+1) + " |  " + usage[i] + " |");
        }

        System.out.println(headerLine);
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i=0; i < usage.length; i++) {
            sum += usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i=0; i < prices.length; i++){
            price += (prices[i] * usage[i]);
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        double pricePerkWh = usage * price;
        if (pricePerkWh > THRESHOLD) {
            double overThreshold = pricePerkWh - THRESHOLD;

            support = overThreshold * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            double hourlySupport = getSupport(usage[i], prices[i]);

            support += hourlySupport;
        }

        return support;
    }

    // g) compute norges pris for a single day
    private static final double NORGESPRIS_KWH = 0.5;

    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price += (usage[i] * NORGESPRIS_KWH);
        }

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (int i = 0; i < usage.length; i++){
            if (usage[i] > temp_max) {
                temp_max = usage[i];
            }
        }

        return temp_max;
    }

    // i) find average powerusage
    public static double findAvgPower(double[] usage) {

        double average = 0;

        average = computePowerUsage(usage) / usage.length;

        return average;
    }
}