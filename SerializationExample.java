import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            System.out.println("Serialized data is saved  in person.ser");
        } catch (IOException i) {
            System.out.println(i);
        }



    }
}