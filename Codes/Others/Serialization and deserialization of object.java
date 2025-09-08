// Question: Write a Java program to serialize and deserialize an object.

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    Student(int id, String name) { this.id = id; this.name = name; }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Aman");

            // Serialization
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);
            out.close();
            System.out.println("Object has been serialized");

            // Deserialization
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s2 = (Student) in.readObject();
            in.close();
            System.out.println("Object has been deserialized");
            System.out.println("ID: " + s2.id + ", Name: " + s2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}