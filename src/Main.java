import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nTask 2");

        List<Integer> numsSet = new ArrayList<>(List.of(1, 17, 1, 42, 2, 12, 3, 4, 4, 5, 5, 6, 7));

        Collections.sort(numsSet);
        int firstNumber = Integer.MIN_VALUE;
        for (Integer i : numsSet) {

            if (i % 2 == 0 && i != firstNumber) {

                System.out.print(i + " ");
                firstNumber = i;
            }
        }

        System.out.println("\nTask 3");

        Set<String> words = new HashSet<>(List.of("cat", "dog", "lion", "child", "dog", "flat",
                "house", "tree", "cat"));
        System.out.println(words);

        System.out.println("\nTask 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> unique = new HashSet<>(strings);
        for (String s : unique) {
            System.out.println(s + ": " + Collections.frequency(strings, s));
        }
    }
}

