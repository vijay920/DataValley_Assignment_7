import java.util.*;

public class ProductSalesAnalyzer {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(20.5, 55.0, 80.75, 120.25, 150.0, 180.50, 210.75, 250.0);
        Map<String, Double> priceRanges = new LinkedHashMap<>();
        priceRanges.put("$0-50", 0.0);
        priceRanges.put("$50-100", 0.0);
        priceRanges.put("$100-200", 0.0);
        priceRanges.put("$200+", 0.0);

        for (Double sale : sales) {
            if (sale <= 50.0) {
                priceRanges.put("$0-50", priceRanges.get("$0-50") + sale);
            } else if (sale <= 100.0) {
                priceRanges.put("$50-100", priceRanges.get("$50-100") + sale);
            } else if (sale <= 200.0) {
                priceRanges.put("$100-200", priceRanges.get("$100-200") + sale);
            } else {
                priceRanges.put("$200+", priceRanges.get("$200+") + sale);
            }
        }

        for (Map.Entry<String, Double> entry : priceRanges.entrySet()) {
            System.out.println("Price Range: " + entry.getKey() +
                    ", Number of Products Sold: " + getProductsSold(entry.getKey(), sales) +
                    ", Total Revenue: $" + entry.getValue());
        }
    }

    private static int getProductsSold(String priceRange, List<Double> sales) {
        double lowerBound = Double.parseDouble(priceRange.substring(1, priceRange.indexOf('-')));
        double upperBound;
        if (priceRange.contains("+")) {
            upperBound = Double.MAX_VALUE;
        } else {
            upperBound = Double.parseDouble(priceRange.substring(priceRange.indexOf('-') + 1));
        }

        int count = 0;
        for (Double sale : sales) {
            if (sale >= lowerBound && sale <= upperBound) {
                count++;
            }
        }

        return count;
    }
}
