package fun_interfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class AllExample {
    public static void main(String[] args) {
        List<String> names= List.of("Ram","Shyam","Mohan");
        Predicate<String > filter = name-> name.startsWith("R");
        Function<String,String> transform = String::toUpperCase;
        Consumer<String > print= System.out::println;

        names.stream()
                .filter(filter)
                .map(transform)
                .forEach(print);

    }
}
