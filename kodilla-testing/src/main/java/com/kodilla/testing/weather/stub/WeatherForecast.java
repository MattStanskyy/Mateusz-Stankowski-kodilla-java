package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double sum = 0;
    private double median = 0;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double average() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        double average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public Double median() {
        List<Double> temperature = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperature);
        if (temperature.size() % 2 == 1) {
            int middle = temperature.size() / 2;
            median = temperature.get(middle);
        }
        return median;
    }

}