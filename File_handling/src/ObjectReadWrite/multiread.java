package ObjectReadWrite;

import java.io.*;

public class multiread {
    public static void main(String[] args) {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("data/studentobj.txt"))){
            while(true){
                student s=(student) in.readObject();
                System.out.println(s.id +" "+s.name);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
