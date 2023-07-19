package com.bl.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static sun.awt.image.MultiResolutionCachedImage.map;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,4,14,16,15,17);
        Stream<Integer> streamData = numbers.stream();
//        streamData.forEach(n -> System.out.println(n));
//        Stream<Integer> processData =
//       int result =
//               numbers.stream()
//                       .filter(n ->n%2==0)
//                        .map(n->n*n)
//                        .forEach(n -> System.out.println(n));
//                        .reduce(0,(a,b) ->a+b);

//        System.out.println(result);
//

    }
}
