package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //a
        System.out.print("Power usage:");
        System.out.println();
        MonthlyPower.print_PowerUsage(power_usage_month);

        //b
        System.out.println();
        System.out.print("Power prices:");
        System.out.println();
        MonthlyPower.print_PowerPrices(power_prices_month);

        //c
        System.out.println();
        double sumUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("Total power usage: %.2f kWt%n", sumUsage);

        //d
        System.out.println();
        double threshold = 1000;
        System.out.println("Exceeds threshold " + threshold + ": " + MonthlyPower.exceedThreshold(power_usage_month, threshold));

        //e
        System.out.println();
        double totalSpot = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println("Total price; " + totalSpot + "nok");

        //f
        System.out.println();
        double support = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("Total power support: %.2f nok%n", support);

        //g
        System.out.println();
        double norgesPrice = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("Norgesprice: %.2f nok%n", norgesPrice);

    }
}