/**
 * @author [E JARON]
 * @version 1.0 UC5-Inline Array Initialization
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayOopsBanner();
    }

    /**
     * UC5: Uses Inline Initialization to create and populate the array 
     * in one compact statement.
     */
    public static void displayOopsBanner() {
        // Combining declaration, initialization, and String.join() calls
        String[] lines = {
            String.join(" ","   *** ","     *** ","  ******","   ***** "),
            String.join(" ","**     **","**     **","*    *"," ** "),
            String.join(" ","**     **","**     **","*    *"," ** "),
            String.join(" ","**     **","**     **","****** ","  ***** "),
            String.join(" ","**     **","**     **","** ","           ** "),
            String.join(" ","**     **","**     **","** ","           ** "),
            String.join(" ","   *** ","     *** ","  ** ","      ***** ")
        };

        // UC5: Using the Enhanced For Loop (for-each) for clean output
        for (String line : lines) {
            System.out.println(line);
        }
    }
}