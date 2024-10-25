import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputData = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 1, 5, 4));
        Map<Integer, Integer> outputData = new HashMap<>();

        for (Integer key : inputData) {
            outputData.put(key, outputData.getOrDefault(key, 0) + 1);
        }

        System.out.println(inputData);
        System.out.println(outputData);
    }
}