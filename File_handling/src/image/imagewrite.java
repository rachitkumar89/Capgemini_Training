package image;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imagewrite {
    public static void main(String[] args) {
        String sourcepath ="F:\\RACHIT\\Capgemini Training\\File_handling\\red.jpg";
        String destinationpath="output/copied.jpg";

        try {
            FileInputStream fis = new FileInputStream(sourcepath);
            FileOutputStream fos = new FileOutputStream(destinationpath);

            byte [] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);

            }
            fis.close();
            fos.close();
            System.out.println("image stored successfully.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
