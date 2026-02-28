package file_handling;

import java.io.File;

public class createFile {
    public static  void main(String [] args){
        File file=new File("data/student.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exixt.");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
