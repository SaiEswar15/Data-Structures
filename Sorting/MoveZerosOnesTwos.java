import java.util.Scanner;
import java.util.Arrays;
public class MoveZerosOnesTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i =0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = arr.length-1;

        //{1,0,2,0,2,2,1,0}
        
        while(j<=k)
        {
            int temp = 0;
            if(arr[j]<arr[i])
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

            if(arr[j]>arr[k])
            {
                temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
            }
            if(arr[i]==0)
            {
                i++;
            }
            if(arr[k]==2)
            {
                k--;
            }

            j++;
        }

        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
