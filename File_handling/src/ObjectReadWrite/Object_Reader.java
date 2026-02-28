package ObjectReadWrite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Object_Reader {
    public static void main(String[] args)  throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/studentobj.txt"));
        student s=(student) in.readObject();

        System.out.println(s.id);
        System.out.println(s.name);

        student s2=(student) in.readObject();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}

