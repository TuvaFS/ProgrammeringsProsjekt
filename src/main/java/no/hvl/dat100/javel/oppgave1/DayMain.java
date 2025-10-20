package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        //a
        DailyPower.printPowerPrices(powerprices_day);

        //b
        System.out.println();
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        //c
        double powerUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("Powerusage for a day: " + powerUsage + " kWh");

        //d
        double spotPricePerDay = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("Powerprice for a day: " + String.format("%.2f", spotPricePerDay) + " NOK");

        //f
        double powerSupportForADay = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("Power support prices for a day: " + String.format("%.2f", powerSupportForADay) + " NOK");

        //g
        double NorgesPriceForADay = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("Norges-pris for a day: " + String.format("%.2f", NorgesPriceForADay) + " NOK");

        //h



    }
}
