package ragesAndJUnit;

import java.util.regex.*;
import java.util.*;

public class QuotedTextExtractor {
    public static List<String> extractQuotes(String text) {
        List<String> quotes = new ArrayList<>();
        Matcher matcher = Pattern.compile("\"(.*?)\"").matcher(text);
        while (matcher.find()) {
            quotes.add(matcher.group(1));
        }
        return quotes;
    }

    public static void main(String[] args) {
        String input = "He said, \"Java is powerful\" and she replied, \"Indeed it is.\"";
        System.out.println(extractQuotes(input));
    }
}
