package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDemo {
    public static void main(String [] args){
        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter("data/student.txt"));
            writer.write("Name :  Rahul");
            writer.newLine();
            writer.write("course : spring");
            writer.newLine();
            writer.write("Marks : 90");
            writer.close();
            System.out.println("Data Written using BufferedWriter");
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
