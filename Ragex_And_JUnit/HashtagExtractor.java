package ragesAndJUnit;

import java.util.regex.*;
import java.util.*;

public class HashtagExtractor {
    public static List<String> extractHashtags(String text) {
        List<String> hashtags = new ArrayList<>();
        Matcher matcher = Pattern.compile("#\\w+").matcher(text);
        while (matcher.find()) {
            hashtags.add(matcher.group());
        }
        return hashtags;
    }

    public static void main(String[] args) {
        String input = "Loving the #Java vibes and #coding challenges!";
        System.out.println(extractHashtags(input));
    }
}

