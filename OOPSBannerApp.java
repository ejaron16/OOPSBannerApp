/**
 * @author [E JARON]
 * @version 6.0 UC6-Perfectly Aligned Modular Methods
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayOopsBanner();
    }

    public static void displayOopsBanner() {
        // String.join connects the 4 letter blocks with 1 space between them
        String[] lines = {
            String.join(" ", getO(0), getO(0), getP(0), getS(0)),
            String.join(" ", getO(1), getO(1), getP(1), getS(1)),
            String.join(" ", getO(2), getO(2), getP(2), getS(2)),
            String.join(" ", getO(3), getO(3), getP(3), getS(3)),
            String.join(" ", getO(4), getO(4), getP(4), getS(4)),
            String.join(" ", getO(5), getO(5), getP(5), getS(5)),
            String.join(" ", getO(6), getO(6), getP(6), getS(6))
        };

        for (String row : lines) {
            System.out.println(row);
        }
    }

    // Every string below is EXACTLY 7 characters long to ensure alignment
    
    public static String getO(int row) {
        String[] o = {"  *** ", " ** ** ", "** **", "** **", "** **", " ** ** ", "  *** "};
        return o[row];
    }

    public static String getP(int row) {
        String[] p = {"****** ", "** **", "** **", "****** ", "** ", "** ", "** "};
        return p[row];
    }

    public static String getS(int row) {
        String[] s = {" ***** ", "** ", "** ", " ***** ", "     **", "     **", " ***** "};
        return s[row];
    }
}