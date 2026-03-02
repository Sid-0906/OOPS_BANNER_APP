public class oopsbannerapp {

<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public static void main(String[] args) {

        System.out.println(String.join("",
                " *****   ",
                " *****   ",
                " ******  ",
                " *****"
        ));

        System.out.println(String.join("",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*"
        ));

        System.out.println(String.join("",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*"
        ));

        System.out.println(String.join("",
                "*     *  ",
                "*     *  ",
                "******   ",
                " ****"
        ));

        System.out.println(String.join("",
                "*     *  ",
                "*     *  ",
                "*        ",
                "     *"
        ));

        System.out.println(String.join("",
                "*     *  ",
                "*     *  ",
                "*        ",
                "     *"
        ));

        System.out.println(String.join("",
                " *****   ",
                " *****   ",
                "*        ",
                "*****"
        ));
    }
=======
    // Method to print banner
    public static void printBanner() {

        // Store banner lines in a String array
        String[] bannerLines = {
            "=======================",
            "        OOPS           ",
            " Object Oriented       ",
            " Programming System    ",
            "======================="
        };

        // Loop through the array and print each line
        for (int i = 0; i < bannerLines.length; i++) {
            System.out.println(bannerLines[i]);
        }
    }
=======
    // Method to print banner
    public static void printBanner() {

        // Store banner lines in a String array
        String[] bannerLines = {
            "=======================",
            "        OOPS           ",
            " Object Oriented       ",
            " Programming System    ",
            "======================="
        };

        // Loop through the array and print each line
        for (int i = 0; i < bannerLines.length; i++) {
            System.out.println(bannerLines[i]);
        }
    }
>>>>>>> Stashed changes

    // Main method
    public static void main(String[] args) {
        printBanner();  // Calling the method
    }
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}