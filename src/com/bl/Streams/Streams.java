package com.bl.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,5,2,6,7,33,45,32,45,89,102,117,8,10,11,18);
        Stream<Integer> streamData = num.stream();
//        int result = num.stream()
//                .filter(n-> (n % 2)! == 0)






    }
}
