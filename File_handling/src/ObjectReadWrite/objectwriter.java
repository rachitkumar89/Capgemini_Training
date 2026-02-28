package ObjectReadWrite;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class objectwriter {
    public  static void main(String[] args) {
        student s = new student(1, "Aman");
        student s1 = new student(2, "Viraj");
        student s2 = new student(3, "Aniket");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/studentobj.txt", true))) {
            out.writeObject(s);
            out.writeObject(s1);
            out.writeObject(s2);
            System.out.println("Object saved successfully.");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    }

