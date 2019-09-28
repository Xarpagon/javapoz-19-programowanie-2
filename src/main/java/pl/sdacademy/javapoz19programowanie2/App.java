package pl.sdacademy.javapoz19programowanie2;

import pl.sdacademy.javapoz19programowanie2.csv.*;
import pl.sdacademy.javapoz19programowanie2.fileOperations.MyFileReader;

import java.util.List;

public class App {
    public static void main(String args[]) {
//        CSVReader csvReader = new CSVReader();
//        List<Person> personList = csvReader.read("/home/xarpagon/IntelliJProjects/fibonacci/src/main/resources/persons.csv");
//        System.out.println("tyko do debuga");
//
//        CSVWriter writer = new CSVWriter();
//        writer.write(personList, "/home/xarpagon/IntelliJProjects/fibonacci/src/main/resources/persons1.csv");
        CarsReader carsReader = new CarsReader();
        List<Car> carsList = carsReader.read("/home/xarpagon/IntelliJProjects/fibonacci/src/main/resources/cars.csv");
        System.out.println("tyko do debuga");

        CarsWriter writer = new CarsWriter();
        writer.write(carsList, "/home/xarpagon/IntelliJProjects/fibonacci/src/main/resources/cars1.csv");
    }
}
