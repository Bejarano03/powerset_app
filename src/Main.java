import java.util.*;

/**
 * The application asked the user for a set of values,
 * which are then returned in powersets.
 *
 * @author Marco Bejarano Oseguera
 * @version 05/21/2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******** Welcome to the Power Set App ********");
        System.out.println("Enter the elements of the set, separated by a comma: ");
        String set = scanner.nextLine();

        String[] elements = set.split(",");
        Set<String> inputSet = new LinkedHashSet<>();
        for (String element : elements) {
            inputSet.add(element);
        }

        List<Set<String>> powerSet = generatePowerSet(inputSet);

        System.out.println("\nPower Set: ");
        for (Set<String> subset : powerSet) {
            System.out.println(subset);
        }

    }

    public static List<Set<String>> generatePowerSet(Set<String> originalSet) {
        List<Set<String>> powerSet = new ArrayList<>();
        List<String> list = new ArrayList<>(originalSet);
        int n = list.size();

        // There are 2^n subsets
        for (int i = 0; i < (1 << n); i++) {
            Set<String> subset = new LinkedHashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(list.get(j));
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

}