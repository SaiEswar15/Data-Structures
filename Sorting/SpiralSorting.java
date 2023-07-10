

class SpiralSorting {

    public static String status1(int[] arr, int N)
    {
        int i = 0;
        while(i<N/2)
        {
            if(arr[i]>arr[i+1])
            {
                return "No";
            }
            i++;
        }
        return "Yes";
    }

    public static String status2(int[] arr, int N)
    {
        int i = N/2;
        while(i < N-1)
        {
            if(arr[i]<arr[i+1])
            {
                return "No";
            }
            i++;
        }
        return "Yes";
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{10, 20, 30, 40, 30, 20, 10};

        int N = arr.length;
        
        if(N%2 == 0)
        {
            System.out.println("No");
        }
        else
        {
            String s1 = status1(arr,N);
            String s2 = status2(arr,N);
            if(s1.equals("Yes") && s2.equals("Yes"))
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }   
    }
}
