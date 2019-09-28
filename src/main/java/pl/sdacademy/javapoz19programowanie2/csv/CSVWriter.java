package pl.sdacademy.javapoz19programowanie2.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    public void write(List<Person> persons, String filePath) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String headerRow = "name;lastName;age;sex;salary";
            bufferedWriter.write(headerRow);
            bufferedWriter.newLine();

            StringBuilder stringBuilder = new StringBuilder();
            for(Person person : persons) {
                stringBuilder.setLength(0);
                stringBuilder.append(person.getName()).append(";")
                        .append(person.getLastName()).append(";")
                        .append(person.getAge()).append(";")
                        .append(person.getSex()).append(";")
                        .append(person.getSalary());
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
