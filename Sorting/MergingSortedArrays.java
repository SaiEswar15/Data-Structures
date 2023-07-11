import java.util.Arrays;
public class MergingSortedArrays {

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
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9};
        int m = arr1.length;
        int n = arr2.length;

        int[] arr = mergeTwoSortedArrays(arr1,arr2,m,n);

        System.out.println(Arrays.toString(arr));
    }
}
