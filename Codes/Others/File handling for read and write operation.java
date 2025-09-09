// Question: Write a Java program to write text into a file and then read it back.

import java.io.*;
import java.util.*;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("sample.txt");
            System.out.print("Enter text to write into file: ");
            String data = sc.nextLine();
            fw.write(data);
            fw.close();
            System.out.println("Data written successfully!");

            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Reading from file:");
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}