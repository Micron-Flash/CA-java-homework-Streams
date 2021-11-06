import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        int max_results = 1000;
        Map<String, String> Grade_mapping = new HashMap<>();
        Grade_mapping.put("A", "90,100");
        Grade_mapping.put("B", "80,89");
        Grade_mapping.put("C", "70,79");
        Grade_mapping.put("D", "60,69");
        Grade_mapping.put("F", "0,59");
        Random random = new Random();
        IntStream stream = IntStream.range(0, max_results)
                .map(i -> (int) (100.0d - Math.exp(random.nextGaussian() * 0.25 + 3.5) + 20));
        List<Integer> all_grades = stream.map(i -> Math.min(100, Math.max(0, i))).boxed().collect(Collectors.toList());
        IntSummaryStatistics stats = all_grades.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        Grade_mapping.entrySet().stream()
                .forEach(i -> System.out.println("Letter Grade " + i.getKey() + ": "
                        + all_grades.stream()
                                .filter(x -> x >= Integer.parseInt(i.getValue().split(",")[0])
                                        && x <= Integer.parseInt(i.getValue().split(",")[1]))
                                .collect(Collectors.toList()).size()
                        + " Students"));
        System.out.println(all_grades.stream().filter(x -> x == 100).collect(Collectors.toList()).size()
                + " Students got a perfect 100");
    }
}
