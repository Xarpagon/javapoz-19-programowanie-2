package pl.sdacademy.javapoz19programowanie2.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CarsWriter {
    public void write(List<Car> cars, String filePath) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String headerRow = "brand;model;productionYear;mileage;bodyType;engineType;engineVolume";
            bufferedWriter.write(headerRow);
            bufferedWriter.newLine();

            StringBuilder stringBuilder = new StringBuilder();
            for(Car car : cars) {
                stringBuilder.setLength(0);
                stringBuilder.append(car.getBrand()).append(";")
                        .append(car.getModel()).append(";")
                        .append(car.getProductionYear()).append(";")
                        .append(car.getMileage()).append(";")
                        .append(car.getBodyType()).append(";")
                        .append(car.getEngineType()).append(";")
                        .append(car.getEngineVolume());
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
