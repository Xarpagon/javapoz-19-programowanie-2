package pl.sdacademy.javapoz19programowanie2.csv;

import java.awt.geom.CubicCurve2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsReader {
    public List<Car> read(String filePath) {
        List<Car> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String headerRow = bufferedReader.readLine();
            String[] headers = headerRow.split(";");

            String record;
            while ((record = bufferedReader.readLine()) != null) {
                String[] tokens = record.split(";");
                Car car = createCar(headers, tokens);
                result.add(car);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private Car createCar(String[] headers, String[] tokens) {
        Car car = new Car();
        for (int i = 0; i < headers.length; i++) {
            if ("brand".equals(headers[i])) {
                car.setBrand(tokens[i]);
            }
            if ("model".equals(headers[i])) {
                car.setModel(tokens[i]);
            }
            if ("productionYear".equals(headers[i])) {
                car.setProductionYear(Integer.parseInt(tokens[i]));
            }
            if ("mileage".equals(headers[i])) {
                car.setMileage(Integer.parseInt(tokens[i]));
            }
            if ("bodyType".equals(headers[i])) {
                car.setBodyType(BodyType.valueOf(tokens[i].toUpperCase()));
            }
            if ("engineType".equals(headers[i])) {
                car.setEngineType(EngineType.valueOf(tokens[i].toUpperCase()));
            }
            if ("engineVolume".equals(headers[i])) {
                car.setEngineVolume(Float.parseFloat(tokens[i]));
            }
        }
        return car;
    }
}
