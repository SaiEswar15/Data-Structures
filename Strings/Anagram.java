import java.util.HashSet;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tam";

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0 ;i<str1.length();i++)
        {
            hs.add(str1.charAt(i));

        }

        boolean flag = true;

        for (int i = 0; i<str2.length();i++ )
        {
            if(!hs.contains(str2.charAt(i)))
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        // for (char el : hs)
        // {
        //     System.out.print(el + " ");
        // }

    }
}
