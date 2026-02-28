package Streamapi_task;

import java.util.Arrays;
import java.util.Comparator;

public class secondhighest {
    public static int findsecondhighest(int [] arr){
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

    }

    public static void main(String[] args) {
        int [] arr={10,29,4,20,5};
        System.out.println(findsecondhighest(arr));
    }
}
