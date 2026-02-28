package Streamapi_task;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class arrayques {
    public static void main(String[] args) {
        int arr[]={1,2,4,2,6,4,5,4,6,3,6,4,1,5,2,2,8,7,8,9};
        Map<Integer,Long> freq= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(freq);
    }
}
