import java.util.*;

class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class oopsbannerapp {

    public static void main(String[] args) {

        List<CharacterPattern> patterns = new ArrayList<>();

        patterns.add(new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patterns.add(new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patterns.add(new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        printBanner("OOPS", patterns);
    }

    public static void printBanner(String text, List<CharacterPattern> patterns) {

        for (int row = 0; row < 5; row++) {

            for (char ch : text.toCharArray()) {

                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        System.out.print(cp.getPattern()[row] + "  ");
                    }
                }

            }

            System.out.println();
        }
    }
}