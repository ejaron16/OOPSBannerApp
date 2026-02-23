/**
 * @author [E JARON]
 * @version 1.0 UC6 - Static Functions
 */
public class OOPSBannerApp {
    public static String[] getOPattern(){
        return new String[]{
            "   ***   ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "   ***   ",
        };
    }
    public static String[] getO2Pattern(){
        return new String[]{
            "   ***   ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "   ***   ",
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            "******",
            "*     *",
            "*     * ",
            "****** ",
            "**      ",
            "**      ",
            "**      ",
        };
    }  
    public static String[] getSPattern() {
        return new String[]{
            " ***** ", 
            "** ", 
            "** ", 
            " ***** ", 
            "     **", 
            "     **", 
            " ***** "
        };
    }

    public static void main(String[] args) {
        // These now all work the same way
        String[] oPattern = getOPattern();
        String[] o2Pattern = getO2Pattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern(); 

        for (int i = 0; i < oPattern.length; i++) {
            // This line joins the pieces into one row
            System.out.println(oPattern[i] + " " + o2Pattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }