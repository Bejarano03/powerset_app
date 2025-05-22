import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class MainTest {
    @Test
    void testEmptySet() {
        Set<String> input = new LinkedHashSet<>();
        List<Set<String>> result = Main.generatePowerSet(input);

        List<Set<String>> expected = new ArrayList<>();
        expected.add(new LinkedHashSet<>()); // Only the empty set

        assertEquals(expected, result);
    }

    @Test
    void testSingleElementSet() {
        Set<String> input = new LinkedHashSet<>(Arrays.asList("a"));
        List<Set<String>> result = Main.generatePowerSet(input);

        List<Set<String>> expected = new ArrayList<>();
        expected.add(new LinkedHashSet<>()); // Empty set
        expected.add(new LinkedHashSet<>(Arrays.asList("a")));

        assertEquals(expected, result);
    }

    @Test
    void testTwoElementSet() {
        Set<String> input = new LinkedHashSet<>(Arrays.asList("a", "b"));
        List<Set<String>> result = Main.generatePowerSet(input);

        List<Set<String>> expected = new ArrayList<>();
        expected.add(new LinkedHashSet<>()); // Empty set
        expected.add(new LinkedHashSet<>(Arrays.asList("a")));
        expected.add(new LinkedHashSet<>(Arrays.asList("b")));
        expected.add(new LinkedHashSet<>(Arrays.asList("a", "b")));

        assertEquals(expected, result);
    }
}