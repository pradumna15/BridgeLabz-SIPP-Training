package ragesAndJUnit;

import java.util.regex.*;
import java.util.*;

public class EmailExtractor {
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("[\\w.-]+@[\\w.-]+").matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String input = "Contact us at support@example.com and info@company.org";
        System.out.println(extractEmails(input));
    }
}

