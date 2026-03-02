public class oopsbannerapp {

    public static String[] generateO() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    public static String[] generateP() {
        return new String[]{
                " *****  ",
                "*     * ",
                " *****  ",
                "*       ",
                "*       "
        };
    }

    public static String[] generateS() {
        return new String[]{
                " *****  ",
                "*       ",
                " *****  ",
                "      * ",
                " *****  "
        };
    }

    public static void main(String[] args) {

        String[] O1 = generateO();
        String[] O2 = generateO();   // Second O
        String[] P  = generateP();
        String[] S  = generateS();

        String[] bannerLines = new String[5];

        for (int i = 0; i < 5; i++) {
            bannerLines[i] = O1[i] + O2[i] + P[i] + S[i];
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}