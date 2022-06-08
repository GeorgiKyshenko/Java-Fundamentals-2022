import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("3.2065415", "20.24234");
        //double n = Double.parseDouble(numbers.get(0));
        //System.out.printf("%.5f", n);
        //System.out.println();
        System.out.println(numbers.stream().map(Double::parseDouble).filter(el -> el > 5).collect(Collectors.toList()));

        Map<String, Map<String, String>> test = new HashMap<>();
        test.put("Georgi", new HashMap<>());
        test.get("Georgi").put("Georgi", "Georgi");
        for (Map.Entry<String, Map<String, String>> entry : test.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
