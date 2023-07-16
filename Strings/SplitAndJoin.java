import java.util.*;
public class SplitAndJoin {
    public static void main(String[] args) {
        
        //convert each words of the string to an array of strings
        String str = "Hello this is Eswar";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        //convert the array of strings to string removing the commas
        String newStr = String.join(" ",arr);
        System.out.println(newStr);

        String trimmed = newStr.replace(" ", "");
        System.out.println(trimmed);

        boolean present = trimmed.contains("this");
        System.out.println(present);



    }
}
