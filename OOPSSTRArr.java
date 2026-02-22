a/**
 * @author [E JARON]
 * @version 1.0
 */
public class OOPSSTRArr {

    public static void main(String[] args) {
        // Now we just call the method instead of writing all the print lines here
        displayOopsBanner();
    }

    // This is the new function (method) we created to hold the banner logic
    public static void displayOopsBanner() {
        String[] lines = new String[7];
        lines[0] = String.join(" ","  ***   ","  ***  ","******","   ***** ");
        lines[1] = String.join(" ","**    **","**   **","*    *"," **      ");
        lines[2] = String.join(" ","**    **","**   **","*    *"," **      ");
        lines[3] = String.join(" ","**    **","**   **","****** ","  *****  ");
        lines[4] = String.join(" ","**    **","**   **","**    ","        ** ");
        lines[5] = String.join(" ","**    **","**   **","**    "," **     ** ");
        lines[6] = String.join(" ","  ***   ","  ***  ","**    ","   *****      ");

   for (String line : lines) {
    System.out.println(line);
   }
}
}