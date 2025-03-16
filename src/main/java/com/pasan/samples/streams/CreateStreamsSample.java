package com.pasan.samples.streams;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamsSample {
    public static void main(String[] args) {
        // Empty stream
        Stream<String> emptyStream = Stream.empty();

        // Finite streams
        Stream<Integer> integerStream = Stream.of(1,3,2);

        List<Integer> integers = List.of(1,3,4);
        Stream<Integer> integerStreamFromArray = integers.stream();
        Stream<Integer> integerParallelStreamFromArray = integers.parallelStream();

        // Infinite Streams
        Stream<Double> infiniteStream = Stream.generate(Math::random);
        Stream<Integer> infiniteStreamIterate = Stream.iterate(1, n -> n + 2);
        Stream<Integer> infiniteStreamIteratePredicate = Stream.iterate(1, n -> n < 50, n -> n + 2);
    }
}
