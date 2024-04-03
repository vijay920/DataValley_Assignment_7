import java.util.*;

public class HousingSalesAnalyzer {
    public static void main(String[] args) {
        List<HousingData> housingDataList = new ArrayList<>();
        housingDataList.add(new HousingData(150000, 1200));
        housingDataList.add(new HousingData(180000, 1400));
        housingDataList.add(new HousingData(220000, 1600));
        housingDataList.add(new HousingData(250000, 1800));
        housingDataList.add(new HousingData(300000, 2000));
        housingDataList.add(new HousingData(350000, 2200));
        housingDataList.add(new HousingData(400000, 2400));
        housingDataList.add(new HousingData(450000, 2600));

        Map<String, Integer> priceRanges = new LinkedHashMap<>();
        priceRanges.put("$100,000-200,000", 0);
        priceRanges.put("$200,000-300,000", 0);
        priceRanges.put("$300,000-400,000", 0);
        priceRanges.put("$400,000-500,000", 0);

        Map<String, Double> averageSquareFootage = new LinkedHashMap<>();
        averageSquareFootage.put("$100,000-200,000", 0.0);
        averageSquareFootage.put("$200,000-300,000", 0.0);
        averageSquareFootage.put("$300,000-400,000", 0.0);
        averageSquareFootage.put("$400,000-500,000", 0.0);

        Map<String, Integer> countPerRange = new LinkedHashMap<>();
        countPerRange.put("$100,000-200,000", 0);
        countPerRange.put("$200,000-300,000", 0);
        countPerRange.put("$300,000-400,000", 0);
        countPerRange.put("$400,000-500,000", 0);

        for (HousingData data : housingDataList) {
            if (data.price >= 100000 && data.price < 200000) {
                priceRanges.put("$100,000-200,000", priceRanges.get("$100,000-200,000") + 1);
                averageSquareFootage.put("$100,000-200,000", averageSquareFootage.get("$100,000-200,000") + data.squareFootage);
                countPerRange.put("$100,000-200,000", countPerRange.get("$100,000-200,000") + 1);
            } else if (data.price >= 200000 && data.price < 300000) {
                priceRanges.put("$200,000-300,000", priceRanges.get("$200,000-300,000") + 1);
                averageSquareFootage.put("$200,000-300,000", averageSquareFootage.get("$200,000-300,000") + data.squareFootage);
                countPerRange.put("$200,000-300,000", countPerRange.get("$200,000-300,000") + 1);
            } else if (data.price >= 300000 && data.price < 400000) {
                priceRanges.put("$300,000-400,000", priceRanges.get("$300,000-400,000") + 1);
                averageSquareFootage.put("$300,000-400,000", averageSquareFootage.get("$300,000-400,000") + data.squareFootage);
                countPerRange.put("$300,000-400,000", countPerRange.get("$300,000-400,000") + 1);
            } else if (data.price >= 400000 && data.price < 500000) {
                priceRanges.put("$400,000-500,000", priceRanges.get("$400,000-500,000") + 1);
                averageSquareFootage.put("$400,000-500,000", averageSquareFootage.get("$400,000-500,000") + data.squareFootage);
                countPerRange.put("$400,000-500,000", countPerRange.get("$400,000-500,000") + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : priceRanges.entrySet()) {
            String key = entry.getKey();
            System.out.println("Price Range: " + key +
                    ", Number of Houses Sold: " + entry.getValue() +
                    ", Average Square Footage: " + (averageSquareFootage.get(key) / countPerRange.get(key)));
        }
    }

    static class HousingData {
        int price;
        int squareFootage;

        HousingData(int price, int squareFootage) {
            this.price = price;
            this.squareFootage = squareFootage;
        }
    }
}
