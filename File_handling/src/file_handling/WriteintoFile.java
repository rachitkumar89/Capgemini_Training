package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteintoFile {
    public static void main(String[] args){
        try {
            dowrite();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public static  void dowrite() throws IOException{
        FileWriter writer =new FileWriter("data/student.txt",true);
        writer.write("\nName  : james");
        writer.write("\nCourse : GOlang");
        writer.write("\n Marks: 84");
        writer.close();
    }
}
