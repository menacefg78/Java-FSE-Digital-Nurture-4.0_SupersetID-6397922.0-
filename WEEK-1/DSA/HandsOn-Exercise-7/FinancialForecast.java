public class FinancialForecast {

    // Recursive method to predict future value
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue; // base case
        } else {
            // Recursive case: grow by rate
            double previousValue = forecastValue(initialValue, growthRate, years - 1);
            return previousValue + (previousValue * growthRate);
        }
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;  // Initial investment
        double growthRate = 0.08;       // 8% annual growth
        int years = 5;

        double futureValue = forecastValue(initialValue, growthRate, years);
        System.out.println("Forecasted Value after " + years + " years: " + futureValue);
    }
}
