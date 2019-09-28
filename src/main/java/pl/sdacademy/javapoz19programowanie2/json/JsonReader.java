package pl.sdacademy.javapoz19programowanie2.json;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    Person read(String filePath) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(bytes, "UTF-8");

            JSONObject object = new JSONObject(content);
            String name = object.getString("name");
            String lastName = object.getString("lastName");
            Integer age = object.getInt("age");
            Double salary = object.getDouble("salary");

            Object addressObject = object.get("address");
            JSONObject addressJSON = new JSONObject(addressObject.toString());
            String city = addressJSON.getString("city");
            String street = addressJSON.getString("street");
            String postalCode = addressJSON.getString("postalCode");

            Person result = new Person();
            result.setName(name);
            result.setLastName(lastName);
            result.setAge(age);
            result.setSalary(salary);

            Address address = new Address();
            address.setCity(city);
            address.setStreet(street);
            address.setPostalCode(postalCode);

            result.setAddress(address);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
