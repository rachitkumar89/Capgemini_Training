package String;

public class string_all {

    public static void main(String[] args) {

        String str = "  Java Programming  ";
        String name = "Rahul";

        // 1. Length
        System.out.println("Length: " + name.length());

        // 2. Uppercase
        System.out.println("Upper: " + name.toUpperCase());

        // 3. Compare
        String s1 = "java";
        String s2 = "java";
        if(s1.equals(s2)) {
            System.out.println("Strings are same");
        }

        // 4. Reverse
        String rev = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        // 5. StartsWith
        if(name.startsWith("R")) {
            System.out.println("Starts with R");
        }

        // 6. charAt
        System.out.println("Char at 2: " + name.charAt(2));

        // 7. Remove spaces
        String noSpace = str.replace(" ", "");
        System.out.println("No space: " + noSpace);

        // 8. Contains
        if(str.contains("Java")) {
            System.out.println("Java found");
        }

        // 9. Count vowels
        int count = 0;
        String temp = "education";
        for(int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);

        // 10. Split words
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Bonus methods
        System.out.println("Trim: " + str.trim());
        System.out.println("Lower: " + str.toLowerCase());
    }
}
