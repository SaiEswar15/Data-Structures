public class SpiralSorting2 {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 2, 4, 3};

        int N = arr.length;
        
        if(N%2 == 0)
        {
            System.out.println("NO");
        }
        else
        {
            int i = 0;
            int j = N/2;
            boolean flag = true;

            while(i<N/2 && j<N-1)
            {
                if(arr[i]<arr[i+1] && arr[j]>arr[j+1])
                {
                    flag = true;
                    i++;
                    j++;
                }
                else
                {
                    flag = false;
                    break;
                }
                
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }   
    }
}
