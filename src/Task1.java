import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    public static boolean isPalindromeUsingIntStream(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
           arr[i] = new Random().nextInt(-1000,1000);
        }
        System.out.println("Array " + Arrays.toString(arr));

        int positiveNumberCount = Stream.of(arr).filter(num -> (Objects.nonNull(num) && num > 0)).toList().size();
        int negativeNumberCount = Stream.of(arr).filter(num -> (Objects.nonNull(num) && num < 0)).toList().size();
        int TwoDigitNumberCount = Stream.of(arr).filter(num -> (Objects.nonNull(num) && Math.abs(num) > 9 && Math.abs(num) < 100)).toList().size();
        int isPalindromeCount = Stream.of(arr).filter(num -> Objects.nonNull(num) && isPalindromeUsingIntStream(num.toString())).toList().size();

        List<Integer> isPalindrome = Stream.of(arr).filter(num -> Objects.nonNull(num) && isPalindromeUsingIntStream(num.toString())).toList();

        System.out.println("Positive Numbers Count ==> "    +   positiveNumberCount);
        System.out.println("Negative Numbers Count ==> "    +   negativeNumberCount);
        System.out.println("Two Digit Numbers Count ==> "   +   TwoDigitNumberCount);
        System.out.println("Is Palindrome Numbers Count==> " + isPalindromeCount);
        System.out.println("Is Palindrome ==> " + isPalindrome);

    }

}