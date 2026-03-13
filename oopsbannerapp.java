import java.util.*;

class BannerCharacterArray {

    private String[] pattern;

    public BannerCharacterArray(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class oopsbannerapp {

    public static void main(String[] args) {

        Map<Character, BannerCharacterArray> bannerMap = new HashMap<>();

        bannerMap.put('O', new BannerCharacterArray(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        bannerMap.put('P', new BannerCharacterArray(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        bannerMap.put('S', new BannerCharacterArray(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        renderBanner("OOPS", bannerMap);
    }

    public static void renderBanner(String word, Map<Character, BannerCharacterArray> bannerMap) {

        int rows = 5;

        for (int r = 0; r < rows; r++) {

            for (char c : word.toCharArray()) {

                BannerCharacterArray letter = bannerMap.get(c);

                if (letter != null) {
                    System.out.print(letter.getPattern()[r] + "  ");
                }

            }

            System.out.println();
        }
    }
}