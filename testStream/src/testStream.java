import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class testStream {
    public static void main(String args[]) {
        testStream.test5();
    }

    public static void test1() {
        List<Integer> test1 = Arrays.asList(13,-4,7,-10,34,-1);

        test1.
                stream()
                .filter(x -> x > 0)
                .sorted()
                .mapToDouble(Integer::doubleValue)
                .mapToObj(x -> x + " score")
                .forEach(System.out::println);
    }

    public static void test2() {
        List<String> test2 = Arrays.asList("a","b","c","d","e");
        test2
                .stream()
                .filter(s -> {
                    System.out.println("filter:" + s);
                    return true;
                })
                .forEach(s -> {
                    System.out.println("foreach: " + s);
                });
    }

    public static void test3() {
        List<String> test = Arrays.asList("a1", "b2", "a2", "c3", "d4");
        test
                .stream()
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    public static void test4() {
        List<String> test = Arrays.asList("a1", "b2", "a2", "c3", "d4");
        test
                .stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.toUpperCase().startsWith("A");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    public static void test5() {
        List<String> test = Arrays.asList("a1", "b2", "a2", "c3", "d4");
        test
                .stream()
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
