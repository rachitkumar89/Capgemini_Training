package Streamapi_task;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4};
        Map<Boolean, List<Integer>> freq= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num%2==0));

        System.out.println(freq.get(true));
        System.out.println(freq.get(false));
    }
}
