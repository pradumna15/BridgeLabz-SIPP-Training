package ragesAndJUnit;

import java.util.regex.*;
import java.util.*;

public class ProgrammingLanguageExtractor {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(extractLanguages(input));
    }
}
