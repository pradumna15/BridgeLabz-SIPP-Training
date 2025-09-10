package ragesAndJUnit;

import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {
    public static Set<String> findRepeats(String text) {
        Set<String> repeats = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
        while (matcher.find()) {
            repeats.add(matcher.group(1));
        }
        return repeats;
    }

    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        System.out.println(findRepeats(input));
    }
}
