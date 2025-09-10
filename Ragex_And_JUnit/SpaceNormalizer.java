package ragesAndJUnit;

public class SpaceNormalizer {
    public static String normalizeSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String input = "This    is  an   example     with multiple spaces.";
        System.out.println(normalizeSpaces(input));
    }
}

