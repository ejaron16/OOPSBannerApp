/**
 * @author [E JARON]
 * @version 1.0 UC6-Refactor Banner Logic into Functions
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // This is the starting point. It just calls the "printer" below.
        displayOopsBanner();
    }

    public static void displayOopsBanner() {
        // We make a list (array) of 7 lines to form the banner.
        // Instead of typing stars here, we ask our "helper methods" for the shapes.
        String[] lines = {
            String.join(" ", getO(0), getO(0), getP(0), getS(0)),
            String.join(" ", getO(1), getO(1), getP(1), getS(1)),
            String.join(" ", getO(2), getO(2), getP(2), getS(2)),
            String.join(" ", getO(3), getO(3), getP(3), getS(3)),
            String.join(" ", getO(4), getO(4), getP(4), getS(4)),
            String.join(" ", getO(5), getO(5), getP(5), getS(5)),
            String.join(" ", getO(6), getO(6), getP(6), getS(6))
        };

        // This "for" loop goes through the list and prints each line one by one.
        for (String row : lines) {
            System.out.println(row);
        }
    }

    // --- HELPER METHODS (The "Shape Makers") ---

    // This method knows what the letter 'O' looks like.
    public static String getO(int lineNum) {
        String[] oPattern = {"  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "};
        return oPattern[lineNum];
    }

    // This method knows what the letter 'P' looks like.
    public static String getP(int lineNum) {
        String[] pPattern = {"****** ", "** **", "** **", "****** ", "** ", "** ", "** "};
        return pPattern[lineNum];
    }

    // This method knows what the letter 'S' looks like.
    public static String getS(int lineNum) {
        String[] sPattern = {" ***** ", "** ", "** ", "  *** ", "    ** ", "    ** ", " ***** "};
        return sPattern[lineNum];
    }
}