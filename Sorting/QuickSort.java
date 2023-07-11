import java.util.Arrays;
public class QuickSort {

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while(j<=high)
        {
            int temp =0;
            if(arr[j]<=pivot)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        return i-1;

    }

    public static void sort(int[] arr, int low, int high)
    {
        //base case
        if(low<=high)
        {
           int p = partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }

        
    }
    public static void main(String[] args) {
        
        int[] arr = new int[]{9,-3,5,2,6,8,-6,1,3};

        int low = 0;
        int high = arr.length-1;
        
        
        sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
