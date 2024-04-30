package Task4;

import java.util.stream.Stream;

public class NumberGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> longStream = generateNumbers(a, c, m);
        longStream.forEach(number -> System.out.println(number));


    }

    static Stream<Long> generateNumbers(long a, long c, long m) {
        long seed = 0;
        return Stream.iterate(seed, number -> 1 * (a * number + c) % m);
    }
}
