import java.util.Arrays;

public class MergeSort {

    public static void divide(int[] arr, int low, int high)
    {
        //base case
        if(low>=high)
        {
            return;
        }
        //smallest amount of task
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        int m = mid-low+1;
        int n = high-mid;

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = low,j = 0; i<=mid ; i++,j++)
        {
            arr1[j] = arr[i];

        }

        for (int i = mid+1,j = 0; i<=high ; i++,j++)
        {
            arr2[j] = arr[i];
            
        }

        int[] mergedArray = mergeTwoSortedArrays(arr1, arr2, m, n);

        for (int i = low,j = 0;j<mergedArray.length;i++,j++)
        {
            arr[i]=mergedArray[j];
        }
        
    }

    public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2,int m,int n)
    {
        // 2 3 4   
        // 5 6 7 8 9
        int[] array = new int[m+n];
        int ptr = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1<m && ptr2<n)
        {
            if(arr1[ptr1]<arr2[ptr2])
            {
                array[ptr] = arr1[ptr1];
                ptr1++;
            }
            else
            {
                array[ptr] = arr2[ptr2];
                ptr2++;
            }
            ptr++;
        }
        while(ptr1<m)
        {
            array[ptr] = arr1[ptr1];
            ptr1++;
            ptr++;
        }
        while(ptr2<n)
        {
            array[ptr] = arr2[ptr2];
            ptr2++;
            ptr++;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,7,3,1,5};

        int low = 0; //0
        int high = arr.length-1; //5

        divide(arr,low,high);

        System.out.println(Arrays.toString(arr));
    }
}
