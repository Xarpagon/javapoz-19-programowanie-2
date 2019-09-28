package pl.sdacademy.javapoz19programowanie2.fileOperations;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    void write(String content, String filePath) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(filePath))) {
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
