import java.util.*;

public class import java.util.*;

public class WeatherAnalyzer {
    public static void main(String[] args) {
        List<WeatherData> weatherDataList = new ArrayList<>();
        weatherDataList.add(new WeatherData(5, 60));
        weatherDataList.add(new WeatherData(15, 70));
        weatherDataList.add(new WeatherData(25, 80));
        weatherDataList.add(new WeatherData(10, 50));
        weatherDataList.add(new WeatherData(20, 65));
        weatherDataList.add(new WeatherData(30, 75));
        weatherDataList.add(new WeatherData(-5, 45));
        weatherDataList.add(new WeatherData(-15, 30));
        weatherDataList.add(new WeatherData(35, 85));

        Map<String, Integer> temperatureRanges = new LinkedHashMap<>();
        temperatureRanges.put("<0°C", 0);
        temperatureRanges.put("0-10°C", 0);
        temperatureRanges.put("10-20°C", 0);
        temperatureRanges.put("20-30°C", 0);
        temperatureRanges.put(">30°C", 0);

        Map<String, Double> averageHumidity = new LinkedHashMap<>();
        averageHumidity.put("<0°C", 0.0);
        averageHumidity.put("0-10°C", 0.0);
        averageHumidity.put("10-20°C", 0.0);
        averageHumidity.put("20-30°C", 0.0);
        averageHumidity.put(">30°C", 0.0);

        Map<String, Integer> countPerRange = new LinkedHashMap<>();
        countPerRange.put("<0°C", 0);
        countPerRange.put("0-10°C", 0);
        countPerRange.put("10-20°C", 0);
        countPerRange.put("20-30°C", 0);
        countPerRange.put(">30°C", 0);

        for (WeatherData data : weatherDataList) {
            if (data.temperature < 0) {
                temperatureRanges.put("<0°C", temperatureRanges.get("<0°C") + 1);
                averageHumidity.put("<0°C", averageHumidity.get("<0°C") + data.humidity);
                countPerRange.put("<0°C", countPerRange.get("<0°C") + 1);
            } else if (data.temperature >= 0 && data.temperature <= 10) {
                temperatureRanges.put("0-10°C", temperatureRanges.get("0-10°C") + 1);
                averageHumidity.put("0-10°C", averageHumidity.get("0-10°C") + data.humidity);
                countPerRange.put("0-10°C", countPerRange.get("0-10°C") + 1);
            } else if (data.temperature > 10 && data.temperature <= 20) {
                temperatureRanges.put("10-20°C", temperatureRanges.get("10-20°C") + 1);
                averageHumidity.put("10-20°C", averageHumidity.get("10-20°C") + data.humidity);
                countPerRange.put("10-20°C", countPerRange.get("10-20°C") + 1);
            } else if (data.temperature > 20 && data.temperature <= 30) {
                temperatureRanges.put("20-30°C", temperatureRanges.get("20-30°C") + 1);
                averageHumidity.put("20-30°C", averageHumidity.get("20-30°C") + data.humidity);
                countPerRange.put("20-30°C", countPerRange.get("20-30°C") + 1);
            } else {
                temperatureRanges.put(">30°C", temperatureRanges.get(">30°C") + 1);
                averageHumidity.put(">30°C", averageHumidity.get(">30°C") + data.humidity);
                countPerRange.put(">30°C", countPerRange.get(">30°C") + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : temperatureRanges.entrySet()) {
            String key = entry.getKey();
            System.out.println("Temperature Range: " + key +
                    ", Number of Days: " + entry.getValue() +
                    ", Average Humidity: " + (averageHumidity.get(key) / countPerRange.get(key)));
        }
    }

    static class WeatherData {
        int temperature;
        int humidity;

        WeatherData(int temperature, int humidity) {
            this.temperature = temperature;
            this.humidity = humidity;
        }
    }
}
 {
    public static void main(String[] args) {
        List<WeatherData> weatherDataList = new ArrayList<>();
        weatherDataList.add(new WeatherData(5, 60));
        weatherDataList.add(new WeatherData(15, 70));
        weatherDataList.add(new WeatherData(25, 80));
        weatherDataList.add(new WeatherData(10, 50));
        weatherDataList.add(new WeatherData(20, 65));
        weatherDataList.add(new WeatherData(30, 75));
        weatherDataList.add(new WeatherData(-5, 45));
        weatherDataList.add(new WeatherData(-15, 30));
        weatherDataList.add(new WeatherData(35, 85));

        Map<String, Integer> temperatureRanges = new LinkedHashMap<>();
        temperatureRanges.put("<0°C", 0);
        temperatureRanges.put("0-10°C", 0);
        temperatureRanges.put("10-20°C", 0);
        temperatureRanges.put("20-30°C", 0);
        temperatureRanges.put(">30°C", 0);

        Map<String, Double> averageHumidity = new LinkedHashMap<>();
        averageHumidity.put("<0°C", 0.0);
        averageHumidity.put("0-10°C", 0.0);
        averageHumidity.put("10-20°C", 0.0);
        averageHumidity.put("20-30°C", 0.0);
        averageHumidity.put(">30°C", 0.0);

        Map<String, Integer> countPerRange = new LinkedHashMap<>();
        countPerRange.put("<0°C", 0);
        countPerRange.put("0-10°C", 0);
        countPerRange.put("10-20°C", 0);
        countPerRange.put("20-30°C", 0);
        countPerRange.put(">30°C", 0);

        for (WeatherData data : weatherDataList) {
            if (data.temperature < 0) {
                temperatureRanges.put("<0°C", temperatureRanges.get("<0°C") + 1);
                averageHumidity.put("<0°C", averageHumidity.get("<0°C") + data.humidity);
                countPerRange.put("<0°C", countPerRange.get("<0°C") + 1);
            } else if (data.temperature >= 0 && data.temperature <= 10) {
                temperatureRanges.put("0-10°C", temperatureRanges.get("0-10°C") + 1);
                averageHumidity.put("0-10°C", averageHumidity.get("0-10°C") + data.humidity);
                countPerRange.put("0-10°C", countPerRange.get("0-10°C") + 1);
            } else if (data.temperature > 10 && data.temperature <= 20) {
                temperatureRanges.put("10-20°C", temperatureRanges.get("10-20°C") + 1);
                averageHumidity.put("10-20°C", averageHumidity.get("10-20°C") + data.humidity);
                countPerRange.put("10-20°C", countPerRange.get("10-20°C") + 1);
            } else if (data.temperature > 20 && data.temperature <= 30) {
                temperatureRanges.put("20-30°C", temperatureRanges.get("20-30°C") + 1);
                averageHumidity.put("20-30°C", averageHumidity.get("20-30°C") + data.humidity);
                countPerRange.put("20-30°C", countPerRange.get("20-30°C") + 1);
            } else {
                temperatureRanges.put(">30°C", temperatureRanges.get(">30°C") + 1);
                averageHumidity.put(">30°C", averageHumidity.get(">30°C") + data.humidity);
                countPerRange.put(">30°C", countPerRange.get(">30°C") + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : temperatureRanges.entrySet()) {
            String key = entry.getKey();
            System.out.println("Temperature Range: " + key +
                    ", Number of Days: " + entry.getValue() +
                    ", Average Humidity: " + (averageHumidity.get(key) / countPerRange.get(key)));
        }
    }

    static class WeatherData {
        int temperature;
        int humidity;

        WeatherData(int temperature, int humidity) {
            this.temperature = temperature;
            this.humidity = humidity;
        }
    }
}
