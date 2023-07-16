import java.util.*; // contains Collections framework

class ComplexAnagram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of elements in array :");
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[N];

        System.out.println("Enter the " + N + " elements inside array :");
        for (int m =0;m<N;m++)
        {
            arr[m] = sc.nextLine();
        }

        System.out.println("Enter the q ierations :");
        int Q = sc.nextInt();

        HashSet<Character> hs = new HashSet<>();
        for (int i =1;i<=Q;i++)
        {
            boolean status = false;
            System.out.println("Enter the string :");
            String str = sc.next();

            for (int j = 0 ;j<str.length();j++)
            {
                hs.add(str.charAt(j));
            }

            
            for (int z = 0 ;z<arr.length;z++)
            {
                String str2 = arr[z];

                boolean flag = true;

                for (int k = 0; k<str2.length();k++ )
                {
                    if(!hs.contains(str2.charAt(k)))
                    {
                        flag = false;
                        break;
                    }
                }

                if(flag)
                {
                    System.out.print(str2 + " ");
                    status = true;
                } 
            }

            if(!status)
            {
                System.out.println("-1");
            }

            hs.clear();
            
        }

        sc.close();

    }
}
