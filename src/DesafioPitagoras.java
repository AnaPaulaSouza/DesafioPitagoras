import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioPitagoras {

    public static List<Integer> minMaxValue(final List<Integer> inputArray) {

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int totalSum = 0;

        for (Integer i : inputArray) {

            if (i < minValue) {
                minValue = i;
            }

            if (i > maxValue) {
                maxValue = i;
            }

            totalSum += i;

        }

        final List<Integer> response = new ArrayList<>();
        response.add(totalSum - maxValue);
        response.add(totalSum - minValue);
        return response;

    }

    public static void main(String[] args) {

        final List<Integer> input = new ArrayList<>();

        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        for (int i = 0; i < n; i ++) {
            input.add(scanner.nextInt());
        }

        final List<Integer> response = minMaxValue(input);

        System.out.println(response.get(0).toString() + " " + response.get(1).toString());


    }
}
