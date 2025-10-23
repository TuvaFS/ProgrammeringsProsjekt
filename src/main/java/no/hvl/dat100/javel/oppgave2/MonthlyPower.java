package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        final int LENGTH_MND = usage.length;        //antall dager
        final int LENGTH_DAY = usage[0].length;     //antall timer

        String headerLine = "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";

        //Header
        System.out.println("Electrical power usage for a month in kWh: ");
        System.out.println(headerLine);
        System.out.print("| Hour / Day |");
        for (int day = 1; day <= LENGTH_MND; day++) {
            System.out.printf("   %02d   |", day);
        }
        System.out.println();
        System.out.println(headerLine);

        //Hours and variables
        for (int i = 0; i < LENGTH_DAY; i++) {

            System.out.print("|  " + String.format("%02d", i) + " - " + String.format("%02d", i+1) + "   |");

            for (int j = 0; j < LENGTH_MND; j++) {

                System.out.printf("  %.2f  |", usage[j][i]);

            }
            System.out.println();
        }

        System.out.println(headerLine);
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

       for(int day = 0; day < prices.length; day++){
           System.out.print("Day " + (day + 1) + ":");
           for(int hour = 0; hour < prices[day].length; hour++){
               System.out.printf("%.2f nok ", prices[day][hour]);
           }
           System.out.println();
       }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (double[] day : usage) {
            for (double hour : day) {
                sum += hour;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int day = 0;
        while (day < powerusage.length && !exceeded) {
            int hour = 0;
            while (hour < powerusage[day].length && !exceeded) {
                usage += powerusage[day][hour];
                if (usage > threshold) {
                    exceeded = true;
                }
                hour++;
            }
            day++;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                price += usage[day][hour] * prices[day][hour];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        double threshold = 0.75;
        double share = 0.90;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                double price = prices[day][hour];
                double used = usage[day][hour];

                if (price > threshold) {
                    double above = price - threshold;
                    support += used * above * share;
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        double norgesPrice = 0.50;
        double totalUsage = computePowerUsage(usage);

        price = norgesPrice * totalUsage;

        return price;
    }
}
