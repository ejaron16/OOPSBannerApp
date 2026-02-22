/**
 * @author [E JARON]
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Now we just call the method instead of writing all the print lines here
        displayOopsBanner();
    }

    // This is the new function (method) we created to hold the banner logic
    public static void displayOopsBanner() {
        System.out.println(String.join(" ","  ***   ","  ***  ","******","   ***** "));
        System.out.println(String.join(" ","**    **","**   **","*    *"," **      "));
        System.out.println(String.join(" ","**    **","**   **","*    *"," **       "));
        System.out.println(String.join(" ","**    **","**   **","****** ","  *****  "));
        System.out.println(String.join(" ","**    **","**   **","**    ","        ** "));
        System.out.println(String.join(" ","**    **","**   **","**    "," **     ** "));
        System.out.println(String.join(" ","  ***   ","  ***  ","**    ","   *****      "));
    }
}
