package StringBuffer;

public class string_buffer_example {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        // append
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert
        sb.insert(4, " is");
        System.out.println("Insert: " + sb);

        // replace
        sb.replace(0, 4, "C++");
        System.out.println("Replace: " + sb);

        // delete
        sb.delete(0, 3);
        System.out.println("Delete: " + sb);

        // reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}