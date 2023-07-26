//Given : "the simple engineer"
//reverse the string using recursion

class StringReversal{

    public static String reverse(String str)
    {
        //base condition
        if(str.isEmpty())
        {
            return "";
        }

        //operation
        return reverse(str.substring(1))+str.charAt(0);

    }

    public static void main(String[] args) {
        
        String str = "the simple engineer";

        System.out.println(reverse(str));


    }
}