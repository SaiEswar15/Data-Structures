import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        System.out.println("sortings");
        
        //0(n^2) // bubble sort
        
        int arr[] = new int[]{3,5,8,2,1,9};
        
        for (int i =0;i<arr.length-1;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                int temp = 0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}