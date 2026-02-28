package file_handling;

import java.io.File;
public class Filedemo {

    public static void main(String[] args){
        File folder =new File("data");

        if(!folder.exists()){
            boolean created = folder.mkdir();

            if(created){
                System.out.println("Folder created successfully");
            }
            else{
                System.out.println("folder creation failed");
            }

        }
        else{
            System.out.println("folder Already exits.");
        }
    }
}

