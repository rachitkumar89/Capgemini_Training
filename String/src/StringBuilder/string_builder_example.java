package StringBuilder;

public class string_builder_example {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // append
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert
        sb.insert(4, " is");
        System.out.println("Insert: " + sb);

        // replace
        sb.replace(0, 4, "Python");
        System.out.println("Replace: " + sb);

        // delete
        sb.delete(0, 6);
        System.out.println("Delete: " + sb);

        // reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}
